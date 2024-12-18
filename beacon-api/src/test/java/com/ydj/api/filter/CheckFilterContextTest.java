package com.ydj.api.filter;

import com.ydj.api.ApiApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class CheckFilterContextTest {

    @Autowired
    private CheckFilterContext checkFilterContext;

    @Test
    public void check(){
        Object obj = new Object();
        checkFilterContext.check(obj);
    }
}