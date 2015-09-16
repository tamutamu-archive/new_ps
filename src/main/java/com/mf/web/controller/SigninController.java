package com.mf.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mf.web.layout.Layout;

@Controller
public class SigninController {

    @Layout(value = "blank")
    @RequestMapping(value = "signin")
    public String signin() {
        return "signin";
    }
}
