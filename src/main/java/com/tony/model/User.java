package com.tony.model;

public class User {

    private Integer id;
    private String userName;
    private String password;
    private String email;
    private Integer age;

    public User(Integer id, String userName, String password,
                String email, Integer age) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.age = age;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
