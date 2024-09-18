package Leetcode;

import java.util.Arrays;


public class Leetcod31{
    public static void main(String[] args) {
        int []nums={1,2,3};
        int i=nums.length-2;
        while(i>=0&&nums[i+1]<=nums[i])
        {
            i--;
        }
        if(i>=0)
        {
            int j=nums.length-1;
            while(nums[j]<=nums[i])
            {
                j--;
            }

            swap1(nums,i,j);
        }
        revers(nums,i+1);
        System.out.println(Arrays.toString(nums));
    }

    private static void swap1(int[] nums, int i, int j) {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    private static void revers(int[] nums, int i) {
        int j=i;
        int e=nums.length-1;
        swap1(nums,j,e);
    }
}
