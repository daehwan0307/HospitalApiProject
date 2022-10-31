package com.springboot.hello.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class User {

    private String id;
    private String name;
    private String password;

}
