package com.phoenix.entity;

import com.phoenix.util.CustomerFormUtil;
import lombok.*;

import java.io.Serializable;
import java.util.List;

/**
 * 自定义表单信息
 */

@Data
public class CustomerFormInfo implements Serializable {

    private String id;  //主键
    private String formName; //表单名称
    private String formDescribe;    //表单文字描述
    private String status; //状态

    private List<CustomerFormElement> customerFormElementList;

    public String getConfig(){
        return CustomerFormUtil.getConfigs(this);
    }
}
