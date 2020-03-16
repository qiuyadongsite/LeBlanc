package com.qyd.play;

/**
 * 冒泡排序
 */

public class BubbleSort extends AbstractSort{
    @Override
    protected int[] doSort(int[] a) {
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[i]){
                    swach(a,i,j);
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort=new BubbleSort();
        bubbleSort.sort();
    }
}
