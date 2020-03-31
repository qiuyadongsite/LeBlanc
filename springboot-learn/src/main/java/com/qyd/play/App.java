package com.qyd.play;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.config.DelegatingApplicationListener;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.*;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.Console;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@RestController
@RequestMapping("/demo")
public class App
{

    public static void main( String[] args )
    {
       SpringApplication.run(App.class);

    }
    @RequestMapping("/query")
    public String query(@RequestParam String name){
        return "hello:"+name;
    }
    @Component
    public class ContextListener implements ApplicationListener<ApplicationReadyEvent> {

        @Override
        public void onApplicationEvent(ApplicationReadyEvent event) {
            String host = null;
            try {
                host = InetAddress.getLocalHost().getHostAddress();
            } catch (UnknownHostException e) {
                e.printStackTrace();
            }
            TomcatServletWebServerFactory factory = (TomcatServletWebServerFactory) event.getApplicationContext().getBean("tomcatServletWebServerFactory");
            int port = factory.getPort();
            String path = factory.getContextPath();
            String url = "http://" + host + ":" + port + path;
            System.out.println("==========================================");
            System.out.println(url);
            System.out.println("==========================================");

        }
    }


}
