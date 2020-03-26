package com.qyd.play.Concurrency.Utilities.JSR236;

import javax.transaction.NotSupportedException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/26 19:27
 * @Description:
 */
public class TranTask implements Runnable {
    UserTransaction ut = null;
    @Override
    public void run() {
// Start a transaction
        try {
            ut.begin();
            // Invoke an EJB
//...
// Update a database using an XA capable JDBC DataSource
//...
// Commit the transaction
            ut.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
