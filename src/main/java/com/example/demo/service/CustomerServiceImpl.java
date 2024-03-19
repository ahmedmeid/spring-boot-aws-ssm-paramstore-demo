package com.example.demo.service;

import com.example.demo.dto.CustomerDto;
import com.example.demo.model.Customer;
import com.example.demo.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.example.demo.util.CustomerMapper.getDto;
import static com.example.demo.util.CustomerMapper.getModel;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository customerRepo;

    public void createCustomer(CustomerDto customer){
        customerRepo.save(getModel(customer));
    }

    public List<CustomerDto> getCustomers(){
        Iterable<Customer> customers = customerRepo.findAll();
        List<CustomerDto> x = new ArrayList<>();
        customers.forEach(customer -> x.add(getDto(customer)));
        return x;
    }
    public CustomerDto getCustomer(Long id){
        Optional<Customer> customer = customerRepo.findById(id);
        CustomerDto dto = getDto(customer.get());
        return dto;
    }
}
