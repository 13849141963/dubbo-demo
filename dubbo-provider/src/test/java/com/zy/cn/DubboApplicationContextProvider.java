package com.zy.cn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class DubboApplicationContextProvider {

    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        System.err.println(context.getDisplayName() + ": here");

        context.start();

        System.err.println("第一台服务已经启动...");

        System.in.read();

    }
}
