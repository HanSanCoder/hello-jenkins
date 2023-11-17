package com.hhs.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：何汉叁
 * @date ：2023/11/17 12:49
 * @description：TODO
 */
@RestController
public class JenkinsController {
    @RequestMapping("/hello")
    public String jenkinsTest() {
        return "Hello World!";
    }
}
