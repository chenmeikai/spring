package com.kenhome.spring;

import com.kenhome.spring.config.ActionFactory;
import com.kenhome.spring.constant.ActionEnum;
import com.kenhome.spring.service.ActionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {



    @Test
    public void contextLoads() {

        ActionService actionService =ActionFactory.getTrafficMode(ActionEnum.CAT);
        actionService.say("hello");

    }

}
