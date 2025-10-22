package com.soap.infrastructure.soap;

import jakarta.xml.ws.Endpoint;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SoapPublisher implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        String url = "http://localhost:8081/ws/customers"; // puedes cambiar el puerto o path
        Endpoint.publish(url, new CustomerEndpoint());
        System.out.println("🚀 SOAP Service running at: " + url + "?wsdl");
    }
}
