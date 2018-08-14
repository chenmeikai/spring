package com.kenhome.spring.service.impl;

import com.kenhome.spring.constant.ActionEnum;
import com.kenhome.spring.service.ActionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @Author: cmk
 * @Description:
 * @Date: 2018\8\14 0014 23:30
 */
@Service
public class CatActionServiceImpl implements ActionService {

    Logger log =LoggerFactory.getLogger(CatActionServiceImpl.class);


    @Override
    public ActionEnum getCode() {
           return ActionEnum.CAT;
    }

    @Override
    public void say(String message) {
        log.info("猫在说："+message);

    }

    @Override
    public void eat(String food) {
        log.info("猫在吃："+food);
    }
}
