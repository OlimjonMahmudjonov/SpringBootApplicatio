package com.springAplication;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ioc-setting.xml");

        MyBean myBean = context.getBean("myBean", MyBean.class);
        myBean.hello();

        MyBean2 myBean2 = context.getBean("myBean2", MyBean2.class);
        myBean2.hello();

        context.close();
    }
}