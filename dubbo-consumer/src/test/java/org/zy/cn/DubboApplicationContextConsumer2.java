package org.zy.cn;

import com.zy.cn.entity.User;
import com.zy.cn.service.UserService;
import com.zy.cn.service.WeatherService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

public class DubboApplicationContextConsumer2 {

    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        System.err.println(context.getDisplayName() + ": here");

        WeatherService weatherService = (WeatherService) context.getBean("weatherService");



        for(int i = 0; i < 10; i++){
            /*String condition = weatherService.queryWeather("北京");

            System.out.println("天气情况:"+condition);*/


            Integer num = weatherService.queryStaff("北京");

            System.out.println(num);
        }



    }


}
