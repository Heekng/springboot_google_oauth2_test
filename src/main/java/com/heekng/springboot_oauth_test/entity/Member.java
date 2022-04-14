package com.heekng.springboot_oauth_test.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {

    @Id @GeneratedValue
    private Long id;

    private String email;
    private String name;
    private String password;
    private String picture;
    @Enumerated(EnumType.STRING)
    private Role role;

    @Builder
    public Member(String email, String name, String password, Role role, String picture) {
        this.email = email;
        this.name = name;
        this.password = password;
        this.role = role;
        this.picture = picture;
    }

    public Member update(String name, String picture) {
        this.name = name;
        this.picture = picture;

        return this;
    }

    public String getRole() {
        return this.role.toString();
    }



}
