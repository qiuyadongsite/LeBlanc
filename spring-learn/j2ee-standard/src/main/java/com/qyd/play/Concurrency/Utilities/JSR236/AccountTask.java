package com.qyd.play.Concurrency.Utilities.JSR236;

import javax.enterprise.concurrent.ManagedTask;
import javax.enterprise.concurrent.ManagedTaskListener;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/26 18:58
 * @Description:
 */
public class AccountTask implements Callable<AccountInfo>, ManagedTask {
    // The ID of the request to report on demand.
    String reqID;
    String accountID;
    Map<String, String> execProps;
    public AccountTask(String reqID, String accountID) {
        this.reqID=reqID;
        this.accountID=accountID;
        execProps = new HashMap<>();
        execProps.put(ManagedTask.IDENTITY_NAME, getIdentityName());
    }
    @Override
    public AccountInfo call() {
// Retrieve account info for the account from some persistent store
        AccountInfo info = null;
        return info;
    }
    public String getIdentityName() {
        return "AccountTask: ReqID=" + reqID + ", Acct=" + accountID;
    }
    @Override
    public Map<String, String> getExecutionProperties() {
        return execProps;
    }
    @Override
    public ManagedTaskListener getManagedTaskListener() {
        return null;
    }
}

class AccountInfo{

}
