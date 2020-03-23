package com.qyd.play.designModel.visitor1.kpi;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/23 15:02
 * @Description:
 */
public class BusinessReport {
    private List<Worker> workers=new ArrayList<>();
    {
        workers.add(new Manager());
        workers.add(new Programmer());
    }
    public void accept(Boss boss){
        for(Worker worker:workers){
            worker.accept(boss);
        }
    }
}
