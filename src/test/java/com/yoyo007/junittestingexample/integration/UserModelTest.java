package com.yoyo007.junittestingexample.integration;

import com.yoyo007.junittestingexample.model.User;
import com.yoyo007.junittestingexample.repository.UserRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-context-test.xml")
public class UserModelTest {
    
    @Autowired
    private UserRepo userRepo;
    
    @Test
    public void springLoadRepos(){
        User user = new User();
        user.setFirstName("test");
        user.setLastName("testing");
        user.setMiddileInitial("T");
        user.setId(1L);
        userRepo.save(user);
        //make sure most basic spring data repos are working and valid using xml based config
    }
    
}
