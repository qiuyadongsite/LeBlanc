package com.qyd.play.Common.Annotations.JSR250;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

import static com.qyd.play.Common.Annotations.JSR250.TransactionAttribute.NEVER;
import static com.qyd.play.Common.Annotations.JSR250.TransactionAttribute.REQUIRED;
import static com.qyd.play.Common.Annotations.JSR250.TransactionAttribute.REQUIRES_NEW;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/26 15:40
 * @Description:继承注解的案例
 *
 */
@TransactionAttribute(REQUIRED)
public class Base {
    @TransactionAttribute(NEVER)
    public void  fool(){};// @TransactionAttribute(NEVER),自己的注解优先类级别定义的

    public void bar(){};//使用类级别暗示的@TransactionAttribute(REQUIRED)
}

@Stateless
class ABean extends Base{
    @Override
    public void  fool(){};//@TransactionAttribute(REQUIRED),子类复写了父类的foo，就不会继承父类的方法的注解

    //此里面的bar();依然是@TransactionAttribute(REQUIRED)，继承了父类bar()所暗示的注解

}

@Stateless
 class BBean extends Base {
    @TransactionAttribute(REQUIRES_NEW)
    public void foo() {}//TransactionAttribute(REQUIRES_NEW),
}
@Stateless
@TransactionAttribute(REQUIRES_NEW)
 class CBean extends Base {
    public void foo() {}//@TransactionAttribute(REQUIRES_NEW)
    @Override
    public void bar() {}//@TransactionAttribute(REQUIRES_NEW)
}
@Stateless
@TransactionAttribute(REQUIRES_NEW)
 class DBean extends Base {

    //foo()//@TransactionAttribute(NEVER)来自base中的
    @Override
    public void bar() {}//重写了所以自己类@TransactionAttribute(REQUIRES_NEW)
}
@Stateless
@TransactionAttribute(REQUIRES_NEW)
 class EBean extends Base {
    //foo();@TransactionAttribute(NEVER),来自父类的Never
    //bar();@TransactionAttribute(REQUIRED)，来自父类的REQUIRED
}
