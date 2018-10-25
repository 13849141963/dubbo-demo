package com.zy.cn.service;

import com.zy.cn.service.WeatherService;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
@Service("weatherService")
public class WeatherServiceImpl implements WeatherService {

    @Override
    public String queryWeather(String address) {

        if(address.equals("北京")){
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
            String format = simpleDateFormat.format(new Date());

            return format+"：北京晴转多云~~~~2~~~~~";
        }
        return "其他城市均为局部有大雪~~~~2~~~~~~";
    }

    @Override
    public Integer queryStaff(String address) {

        if(address.equals("北京")){

            return 20;
        }
        return 20;
    }
}
