package com.kenhome.spring.service;

import com.kenhome.spring.constant.ActionEnum;

/**
 * @Author: cmk
 * @Description: 接口
 * @Date: 2018\8\14 0014 23:23
 */
public interface ActionService {

    public ActionEnum getCode();

    public void say(String message);

    public void eat(String food);

}
