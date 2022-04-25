package com.bookStore.Controller;

import com.bookStore.Bean.User;
import com.bookStore.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/get")
    public List<User> getUsers() {
        System.out.println("hii");
        return (List<User>) userRepository.findAll();
    }
    @PostMapping("/add")
    public User createUser(@RequestBody User user) {
       return  userRepository.save(user);
    }
    @DeleteMapping(path = { "/{id}" })
    public User deleteUser(@PathVariable("id") long id) {
        User user = userRepository.getOne(id);
        userRepository.deleteById(id);
        return user;

}}
