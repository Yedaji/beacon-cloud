package com.ydj.api.vo;

public class R {
    public static ResultVO ok(){
        ResultVO r = new ResultVO();
        r.setCode(0);
        r.setMsg("接收成功");
        return r;
    }

    public static ResultVO error(Integer code, String errMsg) {
        ResultVO r = new ResultVO();
        r.setCode(code);
        r.setMsg(errMsg);
        return r;
    }
}
