package com.andrew.demo.controller;

import com.andrew.demo.dao.UserRepository;
import com.andrew.demo.model.User;
import com.andrew.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "Hello!";
    }

    @RequestMapping(value = "/saveUser", method = RequestMethod.GET)
    public void saveUser() {
        User testUser = new User("andrew", "2345@qq.com");
        userService.saveUser(testUser);
    }

    @RequestMapping("/getUser/{id}")
    public User getUserById(@PathVariable("id") int id) {
        System.out.println("id:" + id);
        return userService.findUser(id);
    }

    @RequestMapping("/getAllUsers")
    public List<User> getAllUsers() {
        return userService.findAllUsers();
    }


    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView save(@ModelAttribute User user) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user-data");
        modelAndView.addObject("user", user);
        return modelAndView;
    }

}
