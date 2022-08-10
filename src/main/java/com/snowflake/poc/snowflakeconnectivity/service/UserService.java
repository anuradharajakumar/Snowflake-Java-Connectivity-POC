package com.snowflake.poc.snowflakeconnectivity.service;

import com.snowflake.poc.snowflakeconnectivity.models.Users;
import com.snowflake.poc.snowflakeconnectivity.repository.UserRepository;
import net.snowflake.client.jdbc.internal.google.common.collect.ImmutableList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {

    @Autowired
    UserRepository userRepository;


    public List<Users> getAllUsers() {
        return ImmutableList.copyOf(userRepository.findAll());
    }
}
