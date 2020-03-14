package com.qyd.play;

/**
 * 插入排序：将前面的两个排序，后面的插入到这个前面的有序数组
 *O(n^2)
 */
public class InsertSort extends AbstractSort {
    @Override
    protected int[] doSort(int[] a) {
        for(int i=1;i<a.length;i++){
            int temp=a[i];
            int index=i;
            for(int j=i-1;j>=0;j--){
                if(a[j]>temp){
                    a[j+1]=a[j];
                    index=j;
                }else{
                    break;
                }
            }
            if(index!=i){
                a[index]=temp;
            }

        }
        return a;
    }

    public static void main(String[] args) {
        InsertSort insertSort=new InsertSort();
        insertSort.sort();
    }
}
