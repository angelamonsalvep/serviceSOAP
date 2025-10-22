package com.soap.infrastructure.mapper;

import com.soap.domain.Customer;
import com.soap.infrastructure.soap.dto.CustomerDTO;

public class CustomerMapper {

    public static CustomerDTO toDTO(Customer customer){
        return new CustomerDTO(
                customer.getId(),
                customer.getName(),
                customer.getEmail()
        );
    }

    public static Customer toDomain(CustomerDTO customerDTO){
        return new Customer(
                customerDTO.getId(),
                customerDTO.getName(),
                customerDTO.getEmail()
        );
    }
}
