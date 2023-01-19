package com.comoyoon.memberservice.domain.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PlaceType {
    DASAN("다산점"),
    SUNGSU("성수점");

    private String name;
}
