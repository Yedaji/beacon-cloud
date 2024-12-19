package com.ydj.api.controller;

import com.ydj.api.enums.SmsCodeEnum;
import com.ydj.api.form.SingleSendForm;
import com.ydj.api.vo.R;
import com.ydj.api.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sms")
@Slf4j
public class SmsController {
    @PostMapping(value = "/single_send", produces = "application/json;charset=utf-8")
    public ResultVO singleSend(@RequestBody @Validated SingleSendForm singleSendForm, BindingResult bindingResult) {
        // 校验参数
        if (bindingResult.hasErrors()) {
            String errMsg = bindingResult.getFieldError().getDefaultMessage();
            log.info("【接口模块-单条短信controller】参数不合法 msg= {}", errMsg);
            return R.error(SmsCodeEnum.PARAMETER_ERROR.getCode(), errMsg);
        }
        return R.ok();
    }
}
