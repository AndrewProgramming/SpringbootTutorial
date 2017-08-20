package com.andrew.demo.service;

import com.andrew.demo.dao.BlogRepository;
import com.andrew.demo.dao.UserRepository;
import com.andrew.demo.model.Blog;
import com.andrew.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogService {
    @Autowired
    private BlogRepository blogRepository;


    public Blog findUser(int id) {
        return blogRepository.findOne(id);
    }
}
