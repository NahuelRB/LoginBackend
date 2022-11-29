package com.morb.login.service;

import com.morb.login.dto.UserDTO;

public interface IUserService {

    void save(UserDTO userDTO);


    //boolean existUsername(UserDTO userDTO);
}
