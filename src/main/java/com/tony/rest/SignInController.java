package com.tony.rest;

import com.tony.dto.UserDto;
import com.tony.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "userProfile/")
public class SignInController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "get/user/profile", produces = "application/json", method = RequestMethod.GET)
    @ResponseBody
    public UserDto getExistingUserProfile(@RequestParam(name = "userName")String userName, @RequestParam(name = "password")String password){

        UserDto dto = userService.getUserByUserNameAndPassword(userName, password);
        ModelAndView response = new ModelAndView();

        return dto;
    }

    @RequestMapping(value = "create/new/profile", produces = "application/json", method = RequestMethod.POST)
    @ResponseBody
    public UserDto createNewUser(@RequestBody UserDto newUser){
        System.out.println(newUser);
        return null;
    }
}
