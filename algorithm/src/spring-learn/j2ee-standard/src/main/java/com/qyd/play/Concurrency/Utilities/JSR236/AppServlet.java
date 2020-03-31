package com.qyd.play.Concurrency.Utilities.JSR236;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import javax.enterprise.concurrent.ManagedExecutorService;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/26 18:53
 * @Description:
 */
public class AppServlet extends HttpServlet implements Servlet {
    // Cache our executor instance
    @Resource(name="concurrent/LongRunningTasksExecutor")
    ManagedExecutorService mes;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse
            resp) throws ServletException, IOException {
// Get the name of the report to run from the input params...
// Assemble the header for the response.
// Create a task instance
        String reportName="";
        String reqID="";
        String accountID="";
        ReporterTask reporterTask = new ReporterTask(reportName);
// Submit the task to the ManagedExecutorService
        Future reportFuture = mes.submit(reporterTask);


        Future<AccountInfo> acctFuture = mes.submit(new AccountTask(reqID, accountID));
        Future<InsuranceInfo> insFuture = mes.submit (new InsuranceTask(reqID, accountID));
// Wait for the results.
        try {
            AccountInfo accountInfo = acctFuture.get();
            InsuranceInfo insInfo = insFuture.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

// Process the results
    }
// Cache the future somewhere (like the client's session)
// The client can then poll the servlet to determine
// the status of the report.
//...
// Tell the user that the report has been submitted.
//...
}