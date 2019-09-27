package com.internal.config;

import com.baomidou.mybatisplus.extension.api.R;
import com.lips.common.exception.IotException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 59780
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public R<Object> handle(Exception e) {
        if (e instanceof IotException){
            return R.restResult(null,MyErrorCode.fromCode(((IotException) e)
                    .getStatus())).setMsg(e.getMessage());
        }
        //自己需要实现的异常处理
        return R.failed(e.getMessage());
    }
}