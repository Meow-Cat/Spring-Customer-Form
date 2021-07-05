package com.phoenix.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义表单信息
 */
public class CustomerFormInfo {

    private String id;  //主键
    private String formName; //表单名称
    private String formDescribe;    //表单文字描述
    private String status; //状态

    private List<CustomerFormElement> customerFormElementList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFormName() {
        return formName;
    }

    public void setFormName(String formName) {
        this.formName = formName;
    }

    public String getFormDescribe() {
        return formDescribe;
    }

    public void setFormDescribe(String formDescribe) {
        this.formDescribe = formDescribe;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<CustomerFormElement> getCustomerFormElementList() {
        return customerFormElementList;
    }

    public void setCustomerFormElementList(List<CustomerFormElement> customerFormElementList) {
        this.customerFormElementList = customerFormElementList;
    }
}
