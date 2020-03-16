package com.qyd.play;

public class HeerSort extends AbstractSort{
    @Override
    protected int[] doSort(int[] a) {
        int d=a.length/2;
        while (d>=1){
            for(int i=0;i<d;i++){
                for(int j=i;j+d<a.length;j+=d){
                    for(int k=i;k+d<a.length;k+=d) {
                        if (a[j] > a[k]) {
                            swach(a, j, k);
                        }
                    }
                }
            }
            d=d/2;
        }
        return a;
    }

    public static void main(String[] args) {
        HeerSort heerSort=new HeerSort();
        heerSort.sort();
    }
}
