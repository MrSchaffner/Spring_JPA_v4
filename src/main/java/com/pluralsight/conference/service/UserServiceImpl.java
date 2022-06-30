package com.pluralsight.conference.service;

import com.pluralsight.conference.Repository.UserRepository;
import com.pluralsight.conference.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;



    @Override //from userService
    @Transactional //required or there should be an error
    public User save(User user){
        return userRepository.save(user);
    }
}
