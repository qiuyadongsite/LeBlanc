package com.qyd.play.Common.Annotations.JSR250;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/26 17:10
 * @Description:
 */
public class PostConstructTest {

    private DataSource myDB;
    private Connection connection;
    @Resource
    private void setMyDB(DataSource ds) {
        myDB = ds;
    }

    @PostConstruct
    private void initialize() throws SQLException {
     //Initialize the connection object from the DataSource
        connection = myDB.getConnection();
    }
}
