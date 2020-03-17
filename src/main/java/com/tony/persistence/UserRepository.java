package com.tony.persistence;

import com.tony.model.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserRepository {

    Log Logger = LogFactory.getLog(UserRepository.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public User getUserByUserNameAndPassword(String userName, String password) {

        String query = "select * from user as u where u.password = ? and u.userName = ? or u.email = ?";
        try {
            return (User) jdbcTemplate.queryForObject(query,
                    new Object[]{password, userName, userName}, new BeanPropertyRowMapper(User.class));
        } catch (Exception e) {
            Logger.error("No user found with userName/email " + userName);
        }
        return new User();
    }

}
