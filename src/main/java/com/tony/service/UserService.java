package com.tony.service;

import com.tony.dto.UserDto;
import com.tony.persistence.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserDto getUserByUserNameAndPassword(String userName, String password){

        return null;
    }
}
