package com.yoyo007.junittestingexample.web.controller.mock;

import com.yoyo007.junittestingexample.model.User;
import com.yoyo007.junittestingexample.web.controller.UserController;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest {
    
    @Test
    public void testMockService(){
        //test to show an example of autowired component with mocks
        UserController controller = new UserController();
        ResponseEntity<Object> response = controller.emptyUser();
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertTrue(response.getBody() instanceof User);
        User emptyUser = (User) response.getBody();
        assertNull(emptyUser.getCreateDate());
    }
}
