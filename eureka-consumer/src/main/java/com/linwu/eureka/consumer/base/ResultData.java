package com.linwu.eureka.consumer.base;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.io.Serializable;

@Data
public class ResultData implements Serializable{
    private int code;
    private String msg;
    private Object data;

    public ResultData() {

    }

    public ResultData(HttpStatus httpStatus,String msg, Object data) {
        this.code = httpStatus.value();
        this.msg = msg;
        this.data = data;

    }

    public ResultData(HttpStatus httpStatus,String msg) {
        this.code = httpStatus.value();
        this.msg = msg;
    }

    public ResultData(HttpStatus httpStatus,Object data) {
        this.code = httpStatus.value();
        this.data = data;
    }

    public static ResultData newInstance() {
        return new ResultData(HttpStatus.OK,null);
    }

    public static ResultData newInstance(Object data) {
        return ResultData.newInstance(HttpStatus.OK, data);
    }

    public static ResultData newInstance(HttpStatus httpStatus, Object data) {
        return new ResultData(httpStatus, data);
    }
}
