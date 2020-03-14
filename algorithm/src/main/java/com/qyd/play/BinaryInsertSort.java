package com.qyd.play;

/**
 * 二分插入排序：时间复杂度高于直接插入排序
 * 总结：记住left和right,left是插入位置
 */
public class BinaryInsertSort extends AbstractSort {
    @Override
    protected int[] doSort(int[] a) {
        for(int i=1;i<a.length;i++){
            int temp=a[i];
            int left=0,right=i-1;
            while (left<=right){
                int mid=(left+right)/2;
                if(temp<a[mid]){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }
            if(left!=i){
                for(int j=i-1;j>=left;j--){
                    a[j+1]=a[j];
                }
                a[left]=temp;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        BinaryInsertSort binaryInsertSort=new BinaryInsertSort();
        binaryInsertSort.sort();
    }
}
