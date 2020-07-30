package com.example.framework.algorithmleetcode;

/**
 * 排序
 *
 * @author xnf
 * @date 2020/07/22
 */
public class SortAlgorithm {

    /**
     * 数组选择排序（就是第1与第2比，如果第1比第2大，位置互换，
     * 互换后的第1与第3比，如果第1比第3大，位置互换，
     * 一直到最后，最小值在第1位。第二次循环时第一位不参与
     * 也就是内循环结束一次，最小值出现头角标位置上。）
     * 关键点：比较相邻位置的数据排序,外层循环次数为n-1;n 表示数组的长度。
     */
    public static int[] selectSort(int arr[]) {
        for(int x=0;x<arr.length-1;x++){
            for(int y= x+1;y<arr.length;y++){
                if(arr[x]>arr[y]){
                    int temp = arr[x];
                     arr[x]= arr[y];
                     arr[y]= temp;
                }
            }
        }
        return arr;
    }

    /**
     * 冒泡排序（第1和第2比，如果第1比第2大，位置互换，
     * 之后第2和第3比，如果2比3大，位置互换， 一直到最后，
     * 最大值在最后一位。第二次循环时最后一位不参与循环
     * 也就是内循环结束一次，最大值出现最后一位）
     * 关键点：循环选出最大数。1、外层排序N-1,每次排序都会选出数组中最大的值，所以，下次排序就可以减少一个次数
     */
    public static int [] bublleSort(int [] arr ){
        for(int x=0;x<arr.length-1;x++){
            //-x: 表示每循环选一次最大值，减少一次
            for(int y = 0;y<arr.length-1-x;y++){
                if(arr[y]>arr[y+1]){
                    int tem = arr[y];
                    arr[y] = arr[y+1];
                    arr[y+1]= tem;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 3, 4, 9};
        int []backArr = selectSort(arr);

        int [] arr1 = {1,7,34,54,2};
        int [] backArr1 = bublleSort(arr1);
        System.out.println("SortAlgorithm.main");

    }

}
