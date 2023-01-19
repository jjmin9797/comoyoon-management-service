package com.comoyoon.memberservice.controller;

import com.comoyoon.memberservice.domain.Member;
import com.comoyoon.memberservice.domain.dto.AddMemberRequestDto;
import com.comoyoon.memberservice.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/findall")
    public ResponseEntity<?> findAllMember() {
        List<Member> members = memberService.findAllMember();
        return ResponseEntity.ok().body(members);
    }

    @PostMapping("/addmember")
    public ResponseEntity<?> addMember(@RequestBody AddMemberRequestDto dto) {
        memberService.addNewMember(dto);
        return ResponseEntity.ok().body("성공");
    }

}
