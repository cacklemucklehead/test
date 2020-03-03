package com.tony.model.mapper;

import com.tony.model.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User> {

    public User mapRow(ResultSet rs, int colNum) throws SQLException {
        User user = new User();

        user.setUserId(rs.getInt("id"));
        user.setfName(rs.getString("fName"));
        user.setlName(rs.getString("lName"));
        user.setEmail(rs.getString("email"));
        user.setUserName(rs.getString("userName"));

        return user;
    }
}
