package com.qyd.play;

public abstract class AbstractSort {

    public void sort(){
        int a[] = initData();
        int sort[]=doSort(a);
        print(sort);
    }

    protected  void print(int[] sort){
        for(int a:sort){
            System.out.print(" "+ a);
        }
    };

    protected void swach(int[] a, int i, int k) {
        int tem=a[i];
        a[i]=a[k];
        a[k]=tem;
    }
    protected abstract int[] doSort(int[] a);

    protected  int[] initData(){
     int[] a=new int[]{3,1,98,43,2,45,11,33,90,100,0};
     return a;
    }
}
