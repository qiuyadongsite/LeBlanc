package com.qyd.play.designModel.prototype.demo;

import java.lang.reflect.Field;

/**
 * Created by qyd.
 */
public class BeanUtils {

    public static Object copy(Object protorype) {
        Class clazz = protorype.getClass();
        Object returnValue = null;
        try {
            returnValue = clazz.newInstance();
            for (Field field : clazz.getDeclaredFields()) {
                field.setAccessible(true);
                field.set(returnValue, field.get(protorype));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return returnValue;
    }
}
