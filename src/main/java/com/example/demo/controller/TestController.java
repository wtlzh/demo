package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Api(tags="测试")
public class TestController {
    @GetMapping("/hello")
    @ApiOperation(value = "测试接口",notes = "用测试")
    @ResponseBody
    public String hello(){
        return "Hello word!";
    }
}