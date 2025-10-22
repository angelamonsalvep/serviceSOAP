package com.soap.application;

import com.soap.domain.Customer;
import com.soap.shared.ICostumerRepository;

import java.util.List;
import java.util.Optional;

public class GetCustomerUseCase {

    private final ICostumerRepository repository;

    public GetCustomerUseCase(ICostumerRepository repository) {
        this.repository = repository;
    }

    public List<Customer> getAll(){
        return repository.findAll();
    }
    public Optional<Customer> getById(int id) {
        return repository.findById(id);
    }
}
