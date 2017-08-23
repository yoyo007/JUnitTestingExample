package com.yoyo007.junittestingexample.web.controller;

import com.yoyo007.junittestingexample.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    
    @GetMapping
    public ResponseEntity emptyUser(){
        ResponseEntity<Object> response;
        
        User user = new User();
//        user.setFirstName("first");
//        user.setMiddileInitial("middle");
//        user.setLastName("last");
//        user.setId(1L);
        response = new ResponseEntity<>(user, HttpStatus.OK);
        return response;
    }
    
}
