package com.example.demo.util;

import com.example.demo.dto.CustomerDto;
import com.example.demo.model.Customer;

public class CustomerMapper {

    public static Customer getModel(CustomerDto dto){
        Customer model = new Customer();
        model.setName(dto.getName());
        model.setMobileNo(dto.getMobileNo());
        model.setAddress(dto.getAddress());
        return model;
    }

    public static CustomerDto getDto(Customer model){
        CustomerDto dto = new CustomerDto();
        dto.setName(model.getName());
        dto.setMobileNo(model.getMobileNo());
        dto.setAddress(model.getAddress());
        return dto;
    }
}
