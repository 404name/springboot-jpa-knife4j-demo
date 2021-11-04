package com.name404.springbootdemo.common.exception;

import com.name404.springbootdemo.common.enums.ErrorCodeEnum;

public class CustomException extends RuntimeException {
    /**
     * 错误码
     */
    private ErrorCodeEnum errorCodeEnum;

    public CustomException(ErrorCodeEnum errorCodeEnum) {
        this.errorCodeEnum = errorCodeEnum;
    }

    public ErrorCodeEnum getErrorCodeEnum() {
        return errorCodeEnum;
    }

    public void setErrorCodeEnum(ErrorCodeEnum errorCodeEnum) {
        this.errorCodeEnum = errorCodeEnum;
    }

    @Override
    public String toString() {
        return "CustomException{" +
                "errorCodeEnum=" + errorCodeEnum +
                '}';
    }
}