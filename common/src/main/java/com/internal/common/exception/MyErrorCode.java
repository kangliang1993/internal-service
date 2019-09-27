package com.internal.common.exception;

import com.baomidou.mybatisplus.extension.api.IErrorCode;

public enum MyErrorCode implements IErrorCode {
    FAILED(-1L, "操作失败"),
    SUCCESS(0L, "执行成功"),
    NO_AUTH(-2L, "尚未登录");
    private final long code;
    private final String msg;

    MyErrorCode(final long code, final String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static MyErrorCode fromCode(long code) {
        MyErrorCode[] ecs = values();
        int var4 = ecs.length;

        for (MyErrorCode ec : ecs) {
            if (ec.getCode() == code) {
                return ec;
            }
        }

        return SUCCESS;
    }

    public long getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

    @Override
    public String toString() {
        return String.format(" ErrorCode:{code=%s, msg=%s} ", this.code, this.msg);
    }
}
