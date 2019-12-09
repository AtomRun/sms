package com.leeup.sms.controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName IndexController
 * @Description TODO
 * @Author cLee
 * @Date{2019/12/6}
 * @Version 1.0
 **/
@RequestMapping("/index/admin")
public class IndexController {

    @RequestMapping("/toindex")
    public String index(){
        return "index";
    }
}
