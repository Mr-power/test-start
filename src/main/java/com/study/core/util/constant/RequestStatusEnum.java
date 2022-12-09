package com.study.core.util.constant;

public enum RequestStatusEnum implements RequestInterface{
    BAD_REQUEST("-2", "bad request/illegal parameter"),
    NOT_FOUND("-1", "service not found"),
    SUCCESS("0", "success"),
    EXCEPTION("1", "error occured");

    private String code ;

    private String message;

    RequestStatusEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
