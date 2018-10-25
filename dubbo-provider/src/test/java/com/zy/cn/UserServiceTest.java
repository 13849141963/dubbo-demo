package com.zy.cn;
import com.zy.cn.entity.User;
import com.zy.cn.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceTest extends ApplicationContext {



    @Autowired
    private UserService userService;

    @Test
    public void testFindId(){
        User user = userService.find(1);
        System.out.println(user.getName());
    }

    @Test
    public void testQueryAll(){
        List<User> users = userService.queryAll();
        for (User user : users) {
            System.out.println(user.getName());
        }
    }

    @Test
    public void testInsert(){
        User user = new User();
        user.setAge(89);
        user.setName("劳斯莱斯");
      userService.inseret(user);
    }


}
