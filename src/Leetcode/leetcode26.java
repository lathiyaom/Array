package Leetcode;

public class leetcode26 {
    public static void main(String[] args) {
/*
*   Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change theq  array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.*/

            int []nums={0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,3,3,4};
            int ans=removeDuplicates(nums);
            //time os o(n)for count
        System.out.println(ans);
    }

    public static int removeDuplicates(int[] nums) {
       int j=1;
       for(int i=1;i<nums.length;i++)
       {
           if(nums[i]!=nums[i-1])
           {
               nums[j++]=nums[i];
           }
       }
       return j;
    }
}
