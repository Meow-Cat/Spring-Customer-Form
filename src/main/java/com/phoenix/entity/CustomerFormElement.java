package com.phoenix.entity;

/**
 * 自定义表单 原子元素
 *
 */
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
     *  默认为1 ,可扩展
     */
    private String log;

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

    public String getColumnType() {
        return columnType;
    }

    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public String getReq() {
        return req;
    }

    public void setReq(String req) {
        this.req = req;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
