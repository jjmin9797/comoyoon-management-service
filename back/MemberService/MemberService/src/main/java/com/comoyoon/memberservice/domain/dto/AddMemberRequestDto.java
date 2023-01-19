package com.comoyoon.memberservice.domain.dto;

import com.comoyoon.memberservice.domain.Member;
import com.comoyoon.memberservice.domain.type.PlaceType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@AllArgsConstructor
@Getter
public class AddMemberRequestDto {
    private String loginId;
    private String password;
    private String name;
    private PlaceType placeOfWork;
    private int hourlyWages;
    private String position;
    private boolean activation;


    public Member toEntity() {
        return Member.builder()
                .loginId(this.loginId)
                .password(this.password)
                .name(this.name)
                .placeOfWork(this.placeOfWork)
                .hourlyWages(this.hourlyWages)
                .position(this.position)
                .activation(this.activation)
                .build();
    }


}
