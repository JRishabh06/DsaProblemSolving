//1. Two Sum

package LeetCodeProblems.java;

import java.util.Arrays;

public class Problem3 {

    public static void main(String[] args) {

        int[] arr = {5,3,2,8};
        int target = 5;
        System.out.println(Arrays.toString(TwoSum(arr,target)));
    }

    static int[] TwoSum(int[] arr , int target){

        for(int i = 0 ; i < arr.length ; i++ ){

            int temp = arr[i];

            if(temp+arr[i+1]==target){

                return new int[]{i , i+1};

            }
        }
        return new  int[]{-1,-1};
    }

}
