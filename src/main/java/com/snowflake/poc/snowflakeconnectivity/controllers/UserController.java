package com.snowflake.poc.snowflakeconnectivity.controllers;

import com.snowflake.poc.snowflakeconnectivity.models.Users;
import com.snowflake.poc.snowflakeconnectivity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public ResponseEntity<List<Users>> getAllUsers() {
        List<Users> result = new ArrayList<>();

        userService.getAllUsers().forEach(result::add);

        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
