package com.comoyoon.memberservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

    @GetMapping("/findall")
    public ResponseEntity<?> findAllMember() {
        return ResponseEntity.ok().body("유저정보");
    }

    @PostMapping("/test")
    public String memberTest() {
        return "얘는 가능";
    }
}
