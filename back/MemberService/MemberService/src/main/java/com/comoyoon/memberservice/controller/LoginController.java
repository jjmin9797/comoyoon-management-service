package com.comoyoon.memberservice.controller;

import com.comoyoon.memberservice.domain.dto.MemberLoginRequestDto;
import com.comoyoon.memberservice.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class LoginController {

    private final MemberService memberService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody MemberLoginRequestDto dto) {
        try {
            String token = memberService.login(dto.getLoginId(),dto.getPassword());
            return ResponseEntity.ok().body(token);
        }catch (UsernameNotFoundException e){
            return ResponseEntity.ok().body("잘못된 정보입니다.");
        }
    }

    @PostMapping("/test")
    public String test() {
        return "얘는 가능";
    }

    @GetMapping("/add/super")
    public String addSuper() {
        memberService.addSuperUser();
        return "addSuperUser";
    }
}
