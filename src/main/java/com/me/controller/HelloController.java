package com.me.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
public class HelloController {



    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        log.debug("hello");
        log.info("hello");
        log.error("hello");
        return "hello rbac";
    }

    @RequestMapping("/tohello")
    public String tohello(){
        return "hello";
    }



}
