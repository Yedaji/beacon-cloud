package com.ydj.api.filter.impl;

import com.ydj.api.filter.CheckFilter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service("ip")
@Slf4j
public class IPCheckFilter implements CheckFilter {
    @Override
    public void check(Object obj) {
        log.info("【ip校验=====】");
    }
}
