package com.soap.infrastructure.soap;

import com.soap.application.GetCustomerUseCase;
import com.soap.infrastructure.mapper.CustomerMapper;
import com.soap.infrastructure.repository.InMemoryCustomerRepository;
import com.soap.infrastructure.soap.dto.CustomerDTO;
import com.soap.shared.ICostumerRepository;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.List;

@WebService(serviceName = "CustomerService")
public class CustomerEndpoint {

    private final GetCustomerUseCase getCustomerUseCase;

    public CustomerEndpoint() {
        ICostumerRepository repository = new InMemoryCustomerRepository();
        this.getCustomerUseCase = new GetCustomerUseCase(repository);
    }

    @WebMethod
    public List<CustomerDTO> getAllCustomers() {
        return getCustomerUseCase.getAll()
                .stream()
                .map(CustomerMapper::toDTO)
                .toList();
    }

    @WebMethod
    public CustomerDTO getCustomerById(@WebParam(name = "id") int id) {
        return getCustomerUseCase.getById(id)
                .map(CustomerMapper::toDTO)
                .orElse(null);
    }
}
