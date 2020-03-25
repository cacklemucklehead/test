package com.tony.rest;

import com.tony.dto.UserDto;
import com.tony.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "userProfile/")
public class SignInController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "get/user/profile", method = RequestMethod.GET)
    @ResponseBody
    public UserDto getExistingUserProfile(@RequestParam(name = "userName")String userName,
                                         @RequestParam(name = "password")String password){

        UserDto dto = userService.getUserByUserNameAndPassword(userName, password);
        return dto;
    }

    @RequestMapping(value = "create/new/user/profile", method = RequestMethod.POST)
    @ResponseBody
    public UserDto createNewUserProfile(@RequestParam(name = "userName")String userName,
                                          @RequestParam(name = "password")String password,
                                        @RequestParam(name = "email")String email,
                                        @RequestParam(name = "age")Integer age){

        UserDto dto = userService.createNewUser(userName, password, email, age);
        return dto;
    }
}
