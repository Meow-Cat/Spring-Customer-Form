package com.phoenix.service.impl;

import com.phoenix.entity.CustomerFormInfo;
import com.phoenix.mapper.CustomerFormMapper;
import com.phoenix.service.CustomerFormService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CustomerFormServiceImpl implements CustomerFormService {

    @Resource
    private CustomerFormMapper customerFormMapper;

    @Override
    public List<CustomerFormInfo> findList(CustomerFormInfo customerFormInfo) {
        return customerFormMapper.findList(customerFormInfo);
    }
}
