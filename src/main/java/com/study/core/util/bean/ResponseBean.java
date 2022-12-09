package com.study.core.util.bean;

import com.study.core.util.constant.RequestStatusEnum;
import lombok.Data;

import java.io.Serializable;

@Data
public class ResponseBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private String code;
    private String message;
    private Object result;

    public ResponseBean() {
    }

    public ResponseBean(String code, String message, Object result) {
        this.code = code;
        this.message = message;
        this.result = result;
    }

    public ResponseBean success(Object result){
        this.code = RequestStatusEnum.SUCCESS.getCode();
        this.message = RequestStatusEnum.SUCCESS.getMessage();
        this.result = result;
        return this;
    }

}
