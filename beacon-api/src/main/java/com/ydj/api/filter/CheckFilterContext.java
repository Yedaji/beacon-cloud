package com.ydj.api.filter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@RefreshScope
public class CheckFilterContext {
    @Autowired
    private Map<String, CheckFilter> checkFilterMap;

    @Value("${filters:apikey,ip,sign,template}")
    private String filters;

    /**
     * 当前check方法用于管理校验链的顺序
     * @param obj
     */
    public void check(Object obj){
       // 将filters切分
        String[] filtersArray = filters.split(",");
        for (String filter : filtersArray) {
            CheckFilter checkFilter = checkFilterMap.get(filter);
            checkFilter.check(obj);
        }
    }
}
