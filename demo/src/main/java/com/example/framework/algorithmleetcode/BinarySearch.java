package com.example.framework.algorithmleetcode;

/**
 * 查找
 *
 * @author xnf
 * @date 2020/07/24
 */
public class BinarySearch {

    /**
     * 二分查找--官方解答（给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，
     * 如果目标值存在返回下标，否则返回 -1）。
     * 关键点：数组的对半查找，注意左右边界。
     * @return
     */
    public static int twoScore(int [] arr,int target){
        int priot , left=0, right = arr.length-1;
        while(left <= right){
            priot = left + (right-left)/2;
            if(arr[priot] == target){
                return  priot;
            }else if(arr[priot] > target){
                right = priot -1;
            }else if(arr[priot] < target){
                left = priot +1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int [] arr =  {-1,0,3,5,9,12};
        int target = 12;
        int backData  = twoScore(arr,target);
        System.out.println("返回值："+backData);
    }

}
