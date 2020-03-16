package com.qyd.play;

/**
 * 简单选择排序：从后边的数组中查找最小和这些数组第一个进行交换；
 * 时间复杂度：n（n-1）/2,优于冒泡排序
 */
public class SelectSort extends AbstractSort {
    @Override
    protected int[] doSort(int[] a) {

        for(int i=0;i<a.length;i++){
            int min=a[i];
            int k=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<min){
                    min=a[j];
                    k=j;
                }
            }
            if(k!=i){
                swach(a,i,k);
            }

        }
        return a;
    }

    public static void main(String[] args) {
        SelectSort selectSort=new SelectSort();
        selectSort.sort();
    }
}
