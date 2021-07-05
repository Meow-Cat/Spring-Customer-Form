package com.phoenix.mapper;

import com.phoenix.entity.CustomerFormInfo;

import java.util.List;

public interface CustomerFormMapper {

    List<CustomerFormInfo> findList(CustomerFormInfo customerFormInfo);

}
