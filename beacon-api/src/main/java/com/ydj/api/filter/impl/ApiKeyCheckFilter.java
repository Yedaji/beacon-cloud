package com.ydj.api.filter.impl;

import com.ydj.api.filter.CheckFilter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service("apikey")
@Slf4j
public class ApiKeyCheckFilter implements CheckFilter {
    @Override
    public void check(Object obj) {
        log.info("【apikey校验=====】");
    }
}
