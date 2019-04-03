package com.lzg.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试接口
 */
@RestController
public class TestController {

    /**
     * 测试接口
     * @return
     */
    @RequestMapping("Test/Success")
    public String test(){
        return "Success";
    }
}
