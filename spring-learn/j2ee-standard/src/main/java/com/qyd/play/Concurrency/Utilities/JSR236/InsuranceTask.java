package com.qyd.play.Concurrency.Utilities.JSR236;

import javax.enterprise.concurrent.ManagedTask;
import javax.enterprise.concurrent.ManagedTaskListener;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/26 19:07
 * @Description:
 */
public class InsuranceTask implements Callable<InsuranceInfo>, ManagedTask {
    // The ID of the request to report on demand.
    String reqID;
    String accountID;
    Map<String, String> execProps;
    public InsuranceTask (String reqID, String accountID) {
        this.reqID=reqID;
        this.accountID=accountID;
        execProps = new HashMap<>();
        execProps.put(ManagedTask.IDENTITY_NAME, getIdentityName());
    }
    @Override
    public InsuranceInfo call() {
// Retrieve the insurance info for the account from some persistent store
        InsuranceInfo info = null;
        return info;
    }
    public String getIdentityName() {
        return "InsuranceTask: ReqID=" + reqID + ", Acct=" + accountID;
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
class InsuranceInfo{

}