package com.andrew.demo.controller;

import com.andrew.demo.model.Blog;
import com.andrew.demo.model.User;
import com.andrew.demo.service.BlogService;
import com.andrew.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {

    @Autowired
    private BlogService blogService;

    @RequestMapping("/getBlogById/{id}")
    public Blog getUserById(@PathVariable("id") int id) {
        return blogService.findUser(id);
    }
}
