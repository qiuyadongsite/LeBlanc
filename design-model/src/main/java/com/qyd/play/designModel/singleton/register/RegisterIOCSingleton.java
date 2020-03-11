package com.qyd.play.designModel.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Auther: qiuyd
 * @Date: 2020/2/27 08:50
 * @Description:
 * 借鉴了Enum的注册方式放到map中，又去实现懒加载
 */
public class RegisterIOCSingleton {
    private static ReentrantReadWriteLock lock=new ReentrantReadWriteLock();
    static Lock readLock=lock.readLock();
    static Lock writeLock=lock.writeLock();
    private static Map<String,Object> ioc=new ConcurrentHashMap<>();
    public static Object getInstance(String className){
        if(!ioc.containsKey(className)){
            writeLock.lock();
            try {
                Class<?> clazz=Class.forName(className);
                Object o= clazz.newInstance();
                ioc.put(className,o);
                return o;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }finally {
                writeLock.unlock();
            }
        }else{
            readLock.lock();
            Object o= ioc.get(className);
            readLock.unlock();
            return o;
        }

    }
}
