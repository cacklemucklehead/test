package com.tony.service;

import com.tony.dto.UserDto;
import com.tony.model.User;
import com.tony.persistence.UserRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    Log Logger = LogFactory.getLog(UserService.class);

    @Autowired
    private UserRepository userRepository;

    public UserDto getUserByUserNameAndPassword(String userName, String password){

        return new UserDto(userRepository.getUserByUserNameAndPassword(userName, password));
    }

    public UserDto createNewUser(String userName, String password,
                                 String email, Integer age){
        if (isUserNameUnique(userName) &&
                isEmailUnique(email) &&
                isAgeValid(age)) {

            User newUser = new User(null,
                    userName,
                    password,
                    email,
                    age);
            int saved = userRepository.saveUser(newUser);
            if(saved == 1){
               return new UserDto(userRepository.getUserByUserNameAndPassword(userName, password));
            }
            Logger.error("User not saved!");
        }
        Logger.error("Bad property values!");
        return null;
    }

    private boolean isUserNameUnique(String userName){
        if(userRepository.verifyUserNameNotTaken(userName)){
           return true;
        }
       return false;
    }

    private boolean isEmailUnique(String email){
        if(userRepository.verifyUserEmailNotTaken(email)){
            return true;
        }
        return false;
    }

    private boolean isAgeValid(Integer age){
        return age > 0 && age < 100;
    }
}
