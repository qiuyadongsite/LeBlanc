package com.qyd.play.Concurrency.Utilities.JSR236;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collection;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/26 19:35
 * @Description:
 */
public class LoggerTimer implements Runnable {
    DataSource ds = null;

    @Override
    public void run() {
        try {
            logEvents(getData(), ds);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Collection getData() {
        return null;
    }

    void logEvents(Collection data, DataSource ds) throws SQLException {
// Iterate through the data and log each row.
        for (; ; ) {
            Connection con = ds.getConnection(); //...
// Write the data using our connection.
//...
// Commit.
            con.commit();
        }
    }
}
