package com.heekng.springboot_oauth_test.entity;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
public class Member {

    @Id
    private String id;
    private String password;
}
