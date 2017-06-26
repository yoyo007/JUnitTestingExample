package com.yoyo007.junittestingexample.util;

import com.yoyo007.junittestingexample.model.User;
import com.yoyo007.junittestingexample.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserUtil {
    
    @Autowired
    private UserRepo userRepo;
    
    public User createAnonymousUser(){
        User anonUser = new User();
        anonUser.setFirstName("Anon");
        anonUser.setLastName("User");
        userRepo.save(anonUser);
        return anonUser;
    }
}
