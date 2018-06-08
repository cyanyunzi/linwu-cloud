package com.linwu.common.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author ：ZhangLei
 * @date ：2018/5/29
 * @description :
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Serializable{
    private String name;
    private Integer age;
}
