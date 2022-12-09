package com.study.controller;

import com.study.core.util.bean.ResponseBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;

@RestController
@RequestMapping("study/test")
public class TestController {

    @GetMapping("/biu")
    public ResponseBean test(){
        return new ResponseBean().success("niu");
    }
}
