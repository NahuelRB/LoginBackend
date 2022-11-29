package com.morb.login.controller;

import com.morb.login.dto.UserDTO;
import com.morb.login.repository.IUserRepository;
import com.morb.login.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private IUserService userService;

    @Autowired
    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @PostMapping()
    public void save(@RequestBody UserDTO userDTO){
        userService.save(userDTO);
    }


    //Querys
    /*@PostMapping("/login")
    public boolean existUsername(@RequestBody UserDTO userDTO){
        return userService.existUsername(userDTO);
    }*/


}
