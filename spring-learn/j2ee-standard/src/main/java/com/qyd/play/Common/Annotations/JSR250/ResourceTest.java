package com.qyd.play.Common.Annotations.JSR250;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/26 16:54
 * @Description:
 */
public class ResourceTest {
    @Resource
    private DataSource myDB;//name 是myDB是起作用的

    @Resource(name="customerDB")
    private DataSource myDB2;//name 是customerDB是起作用的

    private DataSource myDB3;

    @Resource
    private void setMyDB3(DataSource ds) {//setName,Name就是myDB3
        myDB3 = ds;
    }

    @Resource(name="customerDB4")
    private void setMyDB(DataSource ds) {//name必须是customerDB4
        myDB4 = ds;
    }
    private DataSource myDB4;

}
