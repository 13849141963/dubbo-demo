package org.zy.cn;

import com.zy.cn.entity.User;
import com.zy.cn.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

public class DubboApplicationContextConsumer {

    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        System.err.println(context.getDisplayName() + ": here");

        UserService userService = (UserService) context.getBean("userService");


        User user = userService.find(1);

        System.out.println(user.getName());

        /*List<User> users = userService.queryAll();


        for (User user : users) {

            System.out.println(user.getName());
        }*/

    }


}
