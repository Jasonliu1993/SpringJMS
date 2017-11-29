package com.springactivemq.jms.producer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppProducer {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:producer.xml");
        ProduserService produserService = applicationContext.getBean(ProduserService.class);

        for (int i = 0; i < 100; i++) {

            produserService.sendMessage("test" + i);
        }
        applicationContext.close();
    }

}
