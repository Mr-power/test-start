package com.study.controller;

import com.study.core.util.bean.ResponseBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("study/test")
@Slf4j
public class TestController {

    @Value("${ai.callbackUrl}")
    private  String test;

    @GetMapping("/biu")
    public ResponseBean test(){
        log.info("测试1");
        return new ResponseBean().success(test);
    }
}
