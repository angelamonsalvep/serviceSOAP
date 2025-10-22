package com.soap.client;

import com.soap.wsdl.Calculator;
import com.soap.wsdl.CalculatorSoap;

public class SoapClient {

    public static void main(String[] args) {
        // Crear el servicio a partir del WSDL
        Calculator service = new Calculator();

        // Obtener el port (cliente)
        CalculatorSoap calculatorSoap = service.getCalculatorSoap();

        // Consumir el servicio: ejemplo con operación Add
        int num1 = 10;
        int num2 = 5;

        int result = calculatorSoap.add(num1, num2);

        System.out.println("Resultado de " + num1 + " + " + num2 + " = " + result);
    }
}

