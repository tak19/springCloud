package com.example.demo.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Response <T> {
    private int code;
    private T data;
    private String message;
}
