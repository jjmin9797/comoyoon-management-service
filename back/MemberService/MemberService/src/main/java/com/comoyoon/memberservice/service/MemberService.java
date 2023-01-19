package com.comoyoon.memberservice.service;

import com.comoyoon.memberservice.domain.Member;
import com.comoyoon.memberservice.domain.type.PlaceType;
import com.comoyoon.memberservice.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;
    private final BCryptPasswordEncoder encoder;

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
