package com.qyd.play.designModel.decorator.logger;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * Created by qyd.
 */
public class JsonLoggerFactory {

    public static JsonLogger getLogger(Class clazz){
        Logger logger = LoggerFactory.getLogger(clazz);
        return new JsonLogger(logger);
    }
}
