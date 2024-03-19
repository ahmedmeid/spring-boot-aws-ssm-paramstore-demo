package com.example.demo.service;


import com.example.demo.dto.CustomerDto;
import org.springframework.stereotype.Service;
import java.util.List;


public interface CustomerService {

    public void createCustomer(CustomerDto customer);
    public List<CustomerDto> getCustomers();
    public CustomerDto getCustomer(Long id);
}
