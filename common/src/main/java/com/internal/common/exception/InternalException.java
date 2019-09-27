package com.internal.common.exception;

public class InternalException extends RuntimeException {


    private int status = -1;

    private InternalException(String message) {
        super(message);
    }

    private InternalException(int status, String message) {
        super(message);
        this.status = status;
    }

    public static InternalException create(String message) {
        return new InternalException(message);
    }

    public static InternalException create(int status, String message) {
        return new InternalException(status, message);
    }

    public int getStatus() {
        return status;
    }
}
