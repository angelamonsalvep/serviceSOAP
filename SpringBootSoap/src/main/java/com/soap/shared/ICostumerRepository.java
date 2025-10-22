package com.soap.shared;

import com.soap.domain.Customer;

import java.util.List;
import java.util.Optional;

public interface ICostumerRepository {

    List<Customer> findAll();
    Optional<Customer> findById(int id);
    void save(Customer customer);
    boolean deleteById(int id);
}
