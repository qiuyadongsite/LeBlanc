package com.qyd.play.Bean.Validation.JSR303;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.validator.HibernateValidator;
import org.hibernate.validator.messageinterpolation.ResourceBundleMessageInterpolator;
import org.hibernate.validator.resourceloading.PlatformResourceBundleLocator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.MessageSourceResourceBundle;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.misc.MessageUtils;

import javax.annotation.PostConstruct;
import javax.validation.Valid;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.List;
import java.util.Properties;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@RestController
public class App 
{

    private LocalValidatorFactoryBean validator;
    @PostConstruct
    public void setValidate(){
        validator=new LocalValidatorFactoryBean();
        validator.setProviderClass(HibernateValidator.class);
    }
    public static void main( String[] args )
    {
        SpringApplication.run(App.class);
    }
    @RequestMapping("/test")
    public String test(@Valid User user, BindingResult result){

        System.out.println(user);
        if(result.hasErrors()){

            return errorMsg(result);
        }

        return "test";
    }

    protected String errorMsg(BindingResult result) {
        String errorMsg = "";
        if (result.getErrorCount() > 0) {
            List<ObjectError> objectErrorList = result.getAllErrors();
            for (ObjectError objectError : objectErrorList) {

                MessageSource messageSource=new ResourceBundleMessageSource();
                ((ResourceBundleMessageSource) messageSource).setBasename("ValidationMessages.properties");
                ((ResourceBundleMessageSource) messageSource).setUseCodeAsDefaultMessage(false);
                ((ResourceBundleMessageSource) messageSource).setDefaultEncoding("UTF-8");
                String message = messageSource.getMessage(objectError.getCode(), null, objectError.getDefaultMessage(), null);
                if (!StringUtils.isEmpty(message)) {
                    errorMsg = errorMsg + message + "<br />";
                }
            }
        }
        return errorMsg;
    }
}
