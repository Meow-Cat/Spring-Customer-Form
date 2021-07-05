package com.phoenix.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.phoenix.entity.CustomerFormElement;
import com.phoenix.entity.CustomerFormInfo;
import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义表单帮助类
 */
@Log4j2
public class CustomerFormUtil {

    /**
     * 获取表单配置
     * @param customerFormInfo 自定义表单信息
     * @see com.phoenix.entity.CustomerFormInfo
     * @return String
     */
    public static String getConfigs(CustomerFormInfo customerFormInfo){
        JSONArray configList = new JSONArray();
        try {
            customerFormInfo.getCustomerFormElementList().forEach(customerFormElement -> {
                String id = customerFormElement.getId();
                String title = customerFormElement.getTitle();
                String columnType = customerFormElement.getColumnType();
                String log = customerFormElement.getLog();
                String req = customerFormElement.getReq();
                String value = customerFormElement.getValue();
                String items = customerFormElement.getItems();
                JSONObject configsJson = new JSONObject();
                configsJson.put("id",id);
                configsJson.put("title",title);
                configsJson.put("columnType",columnType);
                configsJson.put("log",log);
                configsJson.put("req",req);
                configsJson.put("value",value);
                configsJson.put("items",items);
                configList.add(configsJson);
            });
        }catch (Exception e){
            log.error("CustomerFormUtil.getConfigs execution failed ,throw ex:" , e);
        }
        return configList.toString();
    }

    /**
     * 根据表单配置获取自定义表单原子元素集合
     * @param configs 表单配置
     * @return CustomerFormInfo
     */
    public static CustomerFormInfo getCustomerFormElementList(String configs,CustomerFormInfo customerFormInfo){
        try {
            if (configs == null){
                log.info("Customer {} Element Collection is null",customerFormInfo.getFormName());
                return customerFormInfo;
            }
            List<CustomerFormElement> customerFormElements = new ArrayList<>();
            JSONArray jsonArray = JSONArray.parseArray(configs);
            for (int i = 0; i < jsonArray.size(); i++) {
                JSONObject jsonObject =jsonArray.getJSONObject(i);
                CustomerFormElement customerFormElement = new CustomerFormElement();
                customerFormElement.setId(jsonObject.getString("id"));
                customerFormElement.setTitle(jsonObject.getString("title"));
                customerFormElement.setColumnType(jsonObject.getString("columnType"));
                customerFormElement.setLog(jsonObject.getString("log"));
                customerFormElement.setReq(jsonObject.getString("req"));
                customerFormElement.setValue(jsonObject.getString("value"));
                customerFormElement.setItems(jsonObject.getString("items"));
                customerFormElements.add(customerFormElement);
            }
            customerFormInfo.setCustomerFormElementList(customerFormElements);
            return customerFormInfo;
        }catch (Exception e){
            log.error("CustomerFormUtil.getCustomerFormElementList execution failed ,throw ex:" , e);
        }
        return customerFormInfo;
    }
}
