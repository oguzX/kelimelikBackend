package com.kelimelik.server.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user")
    public List<User> getTopTen(){
        return userService.getTop10();
    }
    @PostMapping("/user")
    public User saveHighScore(@RequestBody User user){
        return userService.addScore(user);
    }
}
