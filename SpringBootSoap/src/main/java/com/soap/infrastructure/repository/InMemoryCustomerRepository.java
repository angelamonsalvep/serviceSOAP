package com.soap.infrastructure.repository;

import com.soap.domain.Customer;
import com.soap.shared.ICostumerRepository;

import java.util.*;

public class InMemoryCustomerRepository implements ICostumerRepository {

    private final Map<Integer, Customer> customers = new HashMap<>();

    public InMemoryCustomerRepository() {
        customers.put(1, new Customer(1, "John", "Doe"));
        customers.put(2, new Customer(2, "Jane", "Smith"));
        customers.put(3, new Customer(3, "Alice", "Johnson"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public Optional<Customer> findById(int id) {
        return Optional.ofNullable(customers.get(id));
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public boolean deleteById(int id) {
        return customers.remove(id)!=null;
    }
}
