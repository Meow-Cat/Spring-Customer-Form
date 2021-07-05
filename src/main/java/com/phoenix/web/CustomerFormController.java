package com.phoenix.web;

import com.phoenix.entity.CustomerFormInfo;
import com.phoenix.service.CustomerFormService;
import com.phoenix.util.CustomerFormUtil;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.List;

@Controller
@RequestMapping("/customer")
@Log4j2
public class CustomerFormController {

    @Autowired
    private CustomerFormService customerFormService;

    @PostConstruct
    public void test(){
        List<CustomerFormInfo> list = customerFormService.findList(new CustomerFormInfo());
        list.forEach(customerFormInfo -> {
            System.out.println(CustomerFormUtil.getConfigs(customerFormInfo));
            CustomerFormUtil.getCustomerFormElementList(CustomerFormUtil.getConfigs(customerFormInfo),customerFormInfo);
        });
        System.out.println("init success");
    }
}
