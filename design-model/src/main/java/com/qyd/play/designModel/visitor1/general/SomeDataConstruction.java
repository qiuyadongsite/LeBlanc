package com.qyd.play.designModel.visitor1.general;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/23 14:21
 * @Description:
 */
public class SomeDataConstruction {
    private  List<DataConstruction> list=new ArrayList<>();
    {
        list.add(new OneDataConstruction());
        list.add(new OtherDataConstruction());
    }

    public void accept(IVisitor visitor){
        for(DataConstruction dataConstruction:this.list){
            dataConstruction.accept(visitor);
        }
    }



}
