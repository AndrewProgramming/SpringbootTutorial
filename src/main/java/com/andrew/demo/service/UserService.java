package com.andrew.demo.service;

import com.andrew.demo.dao.UserRepository;
import com.andrew.demo.model.User;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void saveUser(User user) {
        System.out.println("saving user:" + user.getName());
        userRepository.save(new User(user.getName(), user.getEmail()));
    }

    public User findUser(int id) {
        return userRepository.findOne(id);
    }

    public List<User> findAllUsers() {
        Iterable<User> it = userRepository.findAll();
        List<User> userList = new ArrayList<>();
        for (User user : it) {
            userList.add(user);
        }
        return userList;
    }
    


}
