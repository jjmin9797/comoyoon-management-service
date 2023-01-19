package com.comoyoon.memberservice.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MemberLoginRequestDto {
    private String loginId;
    private String password;
}
