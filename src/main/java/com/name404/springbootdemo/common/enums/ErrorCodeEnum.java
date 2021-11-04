package com.name404.springbootdemo.common.enums;

public enum ErrorCodeEnum {
    /**
     * 错误码
     */
    PARAM_DOES_NOT_EXIEST(1, "查找参数不存在"),
    PARAM_DOES_NOT_CORRENT(2, "所传参数格式不正确"),
    DELETE_ERROR(3, "删除异常");

    ErrorCodeEnum(Integer errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    /**
     * 错误码
     */
    private Integer errorCode;

    /**
     * 错误信息
     */
    private String errorMsg;

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}