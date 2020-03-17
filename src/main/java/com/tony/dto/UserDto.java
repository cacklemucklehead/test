package com.tony.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tony.model.User;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDto {

    private int id;
    private int age;
    private String email;
    private String userName;
    private String password;

    public UserDto() {
    }

    public UserDto(int id, int age, String email, String userName) {
        this.id = id;
        this.age = age;
        this.email = email;
        this.userName = userName;
    }

    public UserDto(User u) {
        this.id = u.getId();
        this.age = u.getAge();
        this.email = u.getEmail();
        this.userName = u.getUserName();
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
