package com.qyd.play;

/**
 * 堆排序，构建大根堆，交换0跟最后一个的位置
 */
public class HeepSort extends AbstractSort {
    @Override
    protected int[] doSort(int[] a) {
        //第一次创建大堆
        bulidMaxHeep(a);
        for(int i=a.length-1;i>=1;i--){
            swach(a,i,0);
            maxHeep(a,i,0);
        }
        return a;
    }

    private void bulidMaxHeep(int[] a) {
        int half=(a.length-1)/2;
        for(int i=half;i>=0;i--){
            maxHeep(a,a.length,i);
        }
    }

    private void maxHeep(int[] a, int length, int index) {
        int left=2*index+1;
        int right=2*index+2;
        int largest=index;
        if(left<length&&a[left]>a[index]){
            largest=left;
        }
        if(right<length&&a[right]>a[largest]){
            largest=right;
        }
        if(largest!=index){
            swach(a,largest,index);
            maxHeep(a,length,largest);
        }
    }

    public static void main(String[] args) {
        HeepSort heepSort=new HeepSort();
        heepSort.sort();
    }
}
