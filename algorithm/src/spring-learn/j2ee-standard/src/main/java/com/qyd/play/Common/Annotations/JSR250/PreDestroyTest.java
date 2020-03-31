package com.qyd.play.Common.Annotations.JSR250;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/26 17:14
 * @Description:
 */
public class PreDestroyTest {
    @Resource
    private void setMyDB(DataSource ds) {
        myDB = ds;
    }
    @PostConstruct
    private void initialize() {
//Initialize the connection object from the DataSource
        try {
            connection = myDB.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @PreDestroy
    private void cleanup() {
//Close the connection to the DataSource.
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private DataSource myDB;
    private Connection connection;
}
