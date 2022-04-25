package com.bookStore.Service;


import com.bookStore.Bean.Book;
import com.bookStore.Bean.Customer;

import com.bookStore.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
@Service
public class CustomerService {
    @Autowired
    private  CustomerRepository repository;
    public List<Customer> getAllCustomers(){

        List<Customer> customerlist = new ArrayList<Customer>();
        repository.findAll().forEach(x -> customerlist.add(x));
        return customerlist;
    }

    public Customer getCustomer(long customerid) {

        return repository.findById(customerid).get();
    }
    public Customer SaveCustomer(Customer customer) {
        Customer C = repository.save(customer);
        return C;
    }
    public  Customer updateCustomer(Customer customer){
    Customer C = repository.save(customer);
        return C;
    }
    public  void deleteCustomer(long customerid){
        repository.deleteById(customerid);

    }

}

