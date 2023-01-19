package com.comoyoon.memberservice.domain;

import com.comoyoon.memberservice.domain.type.PlaceType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;

@Builder
@NoArgsConstructor
@Entity
@AllArgsConstructor
@Getter
@Table(name="member")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;

    @Column(nullable = false, length = 100)
    private String loginId;

    @Column(nullable = false, length = 255)
    private String password;

    @Column(nullable = false, length = 50)
    private String name;

    @Enumerated(EnumType.STRING)
    private PlaceType placeOfWork;

    @Column(nullable = true)
    private int hourlyWages;

    @Column(nullable = false, length = 100)
    private String position;

    @Column(nullable = false)
    private boolean activation;

    @ColumnDefault("0")
    private int totalWorkingHours;

    @Column
    @CreatedDate
    private LocalDate dateOfEmployment;

    @Column
    private boolean isSuperAdmin;
}
