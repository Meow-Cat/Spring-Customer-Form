package com.phoenix.service;

import com.phoenix.entity.CustomerFormInfo;

import java.util.List;

public interface CustomerFormService {

    List<CustomerFormInfo> findList(CustomerFormInfo customerFormInfo);
}
