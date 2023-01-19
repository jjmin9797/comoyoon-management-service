package com.comoyoon.memberservice.controller;

import com.comoyoon.memberservice.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class LoginController {

    private final MemberService memberService;

    @GetMapping("/login")
    public String login() {
        return "SUCCESS";
    }

    @GetMapping("/add/super")
    public String addSuper() {
        memberService.addSuperUser();
        return "addSuperUser";
    }
}
