package com.cegeka.virtualmeetingrooms.controller;

import com.cegeka.virtualmeetingrooms.entity.User;
import com.cegeka.virtualmeetingrooms.service.UserService;
import com.cegeka.virtualmeetingrooms.transferObject.CreateUserTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import static org.springframework.http.ResponseEntity.ok;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/createUser")
    public ResponseEntity<User> createUser(@RequestBody CreateUserTO createUserTO) {
        return ok(userService.createUser(createUserTO.getName()));
    }
}
