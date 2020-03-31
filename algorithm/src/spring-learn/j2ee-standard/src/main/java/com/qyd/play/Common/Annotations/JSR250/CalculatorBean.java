package com.qyd.play.Common.Annotations.JSR250;

import javax.annotation.Resource;
import javax.annotation.Resources;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/26 17:03
 * @Description:
 */
@Resources({
        @Resource(name="myDB",type=javax.sql.DataSource.class),
        @Resource(name="myMQ")
})
public class CalculatorBean {
}
