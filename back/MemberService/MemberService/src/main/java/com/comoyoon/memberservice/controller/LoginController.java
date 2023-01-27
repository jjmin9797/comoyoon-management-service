package com.comoyoon.memberservice.controller;

import com.comoyoon.memberservice.domain.dto.MemberLoginRequestDto;
import com.comoyoon.memberservice.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@Slf4j
public class LoginController {

    private final MemberService memberService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody MemberLoginRequestDto dto) {
        log.info("ID : " + dto.getLoginId() + " + " + dto.getPassword());
        try {
            String token = memberService.login(dto.getLoginId(),dto.getPassword());
            return ResponseEntity.ok().body(token);
        }catch (UsernameNotFoundException e){
            return ResponseEntity.ok().body("잘못된 정보입니다.");
        }
    }

    @GetMapping("/add/super")
    public String addSuper() {
        memberService.addSuperUser();
        return "addSuperUser";
    }

    @GetMapping("/test/get")
    public ResponseEntity<?> testGet() {
        return ResponseEntity.ok().body("Get 요청 성공");
    }

    @PostMapping("/test/post")
    public ResponseEntity<?> testPost(@RequestBody String testMessage) {
        return ResponseEntity.ok().body("Post 성공");
    }

}
