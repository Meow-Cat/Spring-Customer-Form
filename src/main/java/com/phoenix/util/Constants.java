package com.phoenix.util;

public interface Constants {

    /**
     * JobEntity status 属性值说明
     */
    class Status{
        public static final String OPEN = "OPEN"; //开
        public static final String CLOSE = "CLOSE"; //关
    }

    /**
     * 自定义表单的 组件类型描述类
     */
    class columnType{
        //单行输入框
        public static final String INPUTTEXT = "inputText";
        //多行输入框
        public static final String TEXTAREATEXT = "textareaText";
        //数字输入框
        public static final String NUMBERTEXT = "numberText";
        //单选框
        public static final String SINGLESELECT = "singleSelect";
        //多选框
        public static final String MULTIPLESELECT = "multipleSelect";
        //日期选择器
        public static final String SELECTDATE = "selectDate";
        //图片选择器
        public static final String UPLOADERIMG = "uploaderImg";
        //附件选择器
        public static final String UPLOADERFILE = "uploaderFile";
    }

    /**
     * 自定义表单 必填描述类
     */
    class req{
        public static final String REQUIRED = "1";      //必填
        public static final String UNREQUIRED = "0";    //非必填
    }
}
