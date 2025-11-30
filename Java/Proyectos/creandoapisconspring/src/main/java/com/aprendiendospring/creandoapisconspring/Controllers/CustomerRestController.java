package com.aprendiendospring.creandoapisconspring.Controllers;

import com.aprendiendospring.creandoapisconspring.Domain.Customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CustomerRestController {

    private List<Customer> customers = new ArrayList<>(Arrays.asList(
            new Customer(1, "JohnDoe", "john_doe", "password123"),
            new Customer(2, "JaneDoe", "jane_doe", "password456"),
            new Customer(3, "JimBeam", "jim_beam", "password789"),
            new Customer(4, "Daniels", "jdaniels", "password000")
    ));


    @GetMapping("clientes")
    public List<Customer> getCustomers() {
        return customers;
    }
}
