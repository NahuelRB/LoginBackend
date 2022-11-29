package com.morb.login.service.impl;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.morb.login.dto.UserDTO;
import com.morb.login.entity.User;
import com.morb.login.repository.IUserRepository;
import com.morb.login.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    private IUserRepository userRepository;

    @Autowired
    private ObjectMapper mapper;

    @Autowired
    public UserServiceImpl(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void save(UserDTO userDTO){
        User user = mapper.convertValue(userDTO, User.class);
        userRepository.save(user);
    }

    /*//Querys
    @Override
    public boolean existUsername(UserDTO userDTO){
        User user = mapper.convertValue(userDTO, User.class);
        return userRepository.existsByPassword(user,user);
    }*/

}
