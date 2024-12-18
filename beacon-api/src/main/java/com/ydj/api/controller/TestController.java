package com.ydj.api.controller;

import com.ydj.api.filter.CheckFilterContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class TestController {

    @Autowired
    private CheckFilterContext checkFilterContext;

    @GetMapping("/test")
    public void test(Object obj) {
        checkFilterContext.check(obj);
    }
}
