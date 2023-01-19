package com.comoyoon.memberservice.service;

import com.comoyoon.memberservice.domain.Member;
import com.comoyoon.memberservice.domain.dto.AddMemberRequestDto;
import com.comoyoon.memberservice.domain.type.PlaceType;
import com.comoyoon.memberservice.repository.MemberRepository;
import com.comoyoon.memberservice.utils.JwtTokenUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;
    private final BCryptPasswordEncoder encoder;
    @Value("${jwt.secret}")
    private String key;
    private Long expireTimeMs = 1000 * 60 * 60l;

    public String login(String loginId, String password) {
        Member selectedMember = memberRepository.findByLoginId(loginId)
                .orElseThrow(() -> new UsernameNotFoundException("사용자를 찾을 수 없습니다."));
        if (!encoder.matches(password,selectedMember.getPassword())){
            throw new UsernameNotFoundException("비밀 번호가 틀립니다.");
        }
        String token = JwtTokenUtil.createToken(selectedMember.getLoginId(), key, expireTimeMs);
        return token;
    }

    public void addNewMember(AddMemberRequestDto dto){
        Member newMember = dto.toEntity();
        newMember.changeHashPassword(encoder.encode(dto.getPassword()));
        memberRepository.save(newMember);
    }

    public List<Member> findAllMember() {
        return memberRepository.findAll();
    }

    public void addSuperUser() {
        Member member = Member.builder()
                .loginId("admin")
                .password(encoder.encode("1234"))
                .name("홍길동")
                .placeOfWork(PlaceType.DASAN)
                .position("사장")
                .activation(true)
                .isSuperAdmin(true)
                .build();
        memberRepository.save(member);
    }
}
