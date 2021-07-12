package com.phoenix.entity;

import lombok.Builder;
import lombok.Data;

/**
 * 自定义表单 原子元素
 *
 */
@Data
public class CustomerFormElement {

    /**
     * 主键
     */
    private String id;
    /**
     * 组件类型
     * @see com.phoenix.util.Constants.columnType 相关属性说明
     */
    private String columnType;
    /**
     * 组件标题
     */
    private String title;
    /**
     * 提示信息
     */
    private String placeholder;

    /**
     * 是否必填标识
     * @see com.phoenix.util.Constants.req 相关属性说明
     */
    private String req;

    /**
     * 值
     */
    private String value;
    /**
     * 组件类型 多/单选择器时,必填属性
     */
    private String items;
}
