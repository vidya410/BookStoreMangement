package com.bookStore.Controller;

import com.bookStore.Bean.Customer;

import com.bookStore.Service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    @GetMapping("/getallcustomer")
    List<Customer> getAllCustomers() {
        List<Customer> bookList = customerService.getAllCustomers();
        return bookList;
    }

    @PostMapping("/addcustomer")
    Customer SaveCustomer(@RequestBody Customer customer){

        return customerService.SaveCustomer(customer);
    }
    @DeleteMapping("/deletecustomer/{customerid}")
    void deleteCustomer(@PathVariable("customerid") long customerid)  {
        customerService.deleteCustomer(customerid);
    }
    @PutMapping("/updatecustomer")
    Customer updateCustomer(@RequestBody Customer customer) {

        return customerService.updateCustomer(customer);
    }


}
