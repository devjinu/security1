package com.cos.security1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // View를 리턴
public class IndexController {

    // localhost:8080/
    // localhost:8080
    @GetMapping({"","/"})
    public String index(){
        // mustache 기본폴더 src/main/resources/
        // viewResolver 설정 : templates(prefix), .mustache(suffix) 생략가능
        return "index"; // src/main/resources/templates/index.mustache
    }
}
