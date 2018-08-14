package com.kenhome.spring.config;

import com.kenhome.spring.constant.ActionEnum;
import com.kenhome.spring.service.ActionService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: cmk
 * @Description:
 * @Date: 2018\8\14 0014 23:37
 */

@Component
public class ActionFactory implements ApplicationContextAware {

    private static Map<ActionEnum, ActionService> ActionBeanMap;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {


        Map<String, ActionService> map = applicationContext.getBeansOfType(ActionService.class);
        ActionBeanMap = new HashMap<>();
        map.forEach((key, value) -> ActionBeanMap.put(value.getCode(), value));
    }

    public static <T extends ActionService> T getTrafficMode(ActionEnum actionEnum) {
        return (T)ActionBeanMap.get(actionEnum);
    }

}
