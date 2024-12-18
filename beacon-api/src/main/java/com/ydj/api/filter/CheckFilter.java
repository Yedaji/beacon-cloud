package com.ydj.api.filter;

/**
 * 做策略模式的父接口
 */
public interface CheckFilter {

    /**
     * 校验
     * @param obj
     */
    void check(Object obj);
}
