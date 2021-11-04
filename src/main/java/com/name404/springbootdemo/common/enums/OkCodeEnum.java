package com.name404.springbootdemo.common.enums;

public enum OkCodeEnum {
    /**
     * 错误码
     */
    Operate_successfully(1, "操作成功"),
    Param_does_not_correct(2, "成功退出");

    OkCodeEnum(Integer succeeCode, String succeeMsg) {
        this.succeeCode = succeeCode;
        this.succeeMsg = succeeMsg;
    }

    /**
     * 错误码
     */
    private Integer succeeCode;

    /**
     * 错误信息
     */
    private String succeeMsg;

    public Integer getErrorCode() {
        return succeeCode;
    }

    public void setErrorCode(Integer succeeCode) {
        this.succeeCode = succeeCode;
    }

    public String getErrorMsg() {
        return succeeMsg;
    }

    public void setErrorMsg(String succeeMsg) {
        this.succeeMsg = succeeMsg;
    }
}