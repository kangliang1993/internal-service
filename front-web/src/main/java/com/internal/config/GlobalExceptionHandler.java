package com.internal.config;
import com.baomidou.mybatisplus.extension.api.R;
import com.internal.common.exception.InternalException;
import com.internal.common.exception.MyErrorCode;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public R<Object> handle(Exception e) {
        if (e instanceof InternalException){
            return R.restResult(null,MyErrorCode.fromCode(((InternalException) e)
                    .getStatus())).setMsg(e.getMessage());
        }
        //自己需要实现的异常处理
        return R.failed(e.getMessage());
    }
}