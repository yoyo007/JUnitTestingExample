package com.yoyo007.junittestingexample.mock;

import com.yoyo007.junittestingexample.model.User;
import com.yoyo007.junittestingexample.repository.UserRepo;
import com.yoyo007.junittestingexample.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.mockito.ArgumentMatchers.any;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class UserModelMockTest {
    
    @Mock
    private UserRepo userRepo;
    
    @InjectMocks
    private UserService userUtil;
    
    @Test
    public void testMockService(){
        //test to show an example of autowired component with mocks
        User user = userUtil.createAnonymousUser();
        
        verify(userRepo, times(1)).save(any(User.class));
    }
    
}
