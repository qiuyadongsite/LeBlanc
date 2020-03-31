package com.qyd.play;

import com.qyd.play.service.RequestService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class DubboConsumer
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(
                "*.xml");
        context.start();
        RequestService requestService=(RequestService) context.getBean("requestService");
        System.out.println(requestService.dealSome("test"));
        context.destroy();
    }
}
