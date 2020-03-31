package com.qyd.play.Concurrency.Utilities.JSR236;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/26 18:46
 * @Description:
 */
public class ReporterTask implements Runnable {
    String reportName;
    DataSource ds = null;
    public ReporterTask(String reportName) {
        this.reportName = reportName;
    }
    @Override
    public void run() {
// Run the named report
        if("TransactionReport".equals(reportName)) {
            try {
                runTransactionReport();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
else if("SummaryReport".equals(reportName)) {
                runSummaryReport();
            }
        }

    private void runSummaryReport() {
    }

    void runTransactionReport() throws SQLException {
           Connection con = ds.getConnection(); //...
// Read/Write the data using our connection.
//...
// Commit.
                con.commit();
                
            }
     
}

