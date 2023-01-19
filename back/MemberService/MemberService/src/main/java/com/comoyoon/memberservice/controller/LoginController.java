package com.comoyoon.memberservice.controller;

import com.comoyoon.memberservice.domain.dto.MemberLoginRequestDto;
import com.comoyoon.memberservice.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class LoginController {

    private final MemberService memberService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody MemberLoginRequestDto dto) {
        String token = memberService.login(dto.getLoginId(),dto.getPassword());
        return ResponseEntity.ok().body(token);
    }

    @GetMapping("/add/super")
    public String addSuper() {
        memberService.addSuperUser();
        return "addSuperUser";
    }
}
