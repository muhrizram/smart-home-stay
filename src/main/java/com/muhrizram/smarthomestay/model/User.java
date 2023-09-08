package com.muhrizram.smarthomestay.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class User {
    private String name;
    private Long age;
    private String location;
    private String email;
    private char gender;
}
