package com.tony.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tony.model.User;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDto {

    private int id;
    private String fName;
    private String lName;
    private String email;
    private String userName;


    public UserDto(User user) {
        this.id = user.getUserId();
        this.fName = user.getfName();
        this.lName = user.getlName();
        this.email = user.getEmail();
        this.userName = user.getUserName();
    }

    public UserDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
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
}
