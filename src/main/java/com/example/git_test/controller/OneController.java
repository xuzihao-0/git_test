package com.example.git_test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuzihao
 * @version 1.0
 * @date 2023/3/5 12:31
 */
@RestController
public class OneController {

    @GetMapping("hello")
    public String say(){
        return "你好";
    }



}
