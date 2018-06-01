package com.linwu.common.model.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author ：ZhangLei
 * @date ：2018/5/29
 * @description :
 */
@Data
public class Student implements Serializable{
    private String name;
    private Integer age;
}
