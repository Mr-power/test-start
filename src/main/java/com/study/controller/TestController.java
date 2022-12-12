package com.study.controller;

import com.study.core.util.bean.ResponseBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("study/test")
public class TestController {

    private final static Logger log = LoggerFactory.getLogger("lnyLogger");

    @Value("${host.tezign-data-analysis-web.url}")
    private  String test;

    @GetMapping("/biu")
    public ResponseBean test(){
        log.info("测试1");
        return new ResponseBean().success(test);
    }
}
