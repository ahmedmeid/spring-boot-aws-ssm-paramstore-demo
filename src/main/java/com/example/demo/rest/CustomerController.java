package com.example.demo.rest;


import com.example.demo.dto.CustomerDto;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/customers")
    List<CustomerDto> getCustomers(){
       return customerService.getCustomers();
    }
    @PostMapping("/customers")
    void createCustomer(@RequestBody CustomerDto dto){
       customerService.createCustomer(dto);
    }
    @GetMapping("/customers/{id}")
    CustomerDto getCustomer(@PathVariable Long id){
        CustomerDto dto = customerService.getCustomer(id);
        return dto;
    }

}
