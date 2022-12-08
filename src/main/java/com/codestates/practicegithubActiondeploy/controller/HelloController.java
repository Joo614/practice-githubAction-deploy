package com.codestates.practicegithubActiondeploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello World! Hello Be BootCamp!" +
                "오늘은 빨리 성공해서 너모 좋다 ㅎㅎ";
    }
}
