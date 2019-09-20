package com.service.serviceImpl;

import com.pojo.Student;
import com.pojo.User;
import com.service.StudentService;
import com.service.UserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRmi {

//    static Logger logger = Logger.getLogger(String.valueOf(TestRmi.class));
    Logger logger = Logger.getLogger(TestRmi.class);
    @Test
    public void getList() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userRMIClient");
        User u =userService.selectByName("shouji");
        logger.info(String.valueOf(u));
    }
}
