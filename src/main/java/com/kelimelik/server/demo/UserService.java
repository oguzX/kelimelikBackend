package com.kelimelik.server.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Period;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User addScore(User user){
        return userRepository.save(user);
    }

    public List<User> getTop10(){
        return userRepository.getTop10();
    }
}
