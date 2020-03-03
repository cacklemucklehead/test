package com.tony.persistence;

import com.tony.model.User;
import com.tony.model.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public User getUserByUserNameAndPassword(String userName, String password){

        String query = "select * from user as u where u.userName = ? and u.password = ?";

        return jdbcTemplate.queryForObject(query, new Object[] {userName, password}, new UserMapper());
    }

}
