package com.tony.rest;

import com.tony.dto.UserDto;
import com.tony.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "userProfile/")
public class SignInController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "get/user/profile", produces = "application/json", method = RequestMethod.GET)
    @ResponseBody
    public UserDto getExistingUserProfile(@RequestParam(name = "userName")String userName, @RequestParam(name = "password")String password){

        return userService.getUserByUserNameAndPassword(userName, password);
    }
}
