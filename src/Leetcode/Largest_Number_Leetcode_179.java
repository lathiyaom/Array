package Leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class Largest_Number_Leetcode_179 {
    public static void main(String[] args) {

    }
    public  static String largestNumber(int[] nums) {
        String[]strarr=new String[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            strarr[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(strarr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                StringBuilder frist=new StringBuilder(o1+o2);
                StringBuilder second=new StringBuilder(o2+o1);
                return second.compareTo(frist);
            }
        });
        if(strarr[0].equals("0"))return "0";
        StringBuilder ans=new StringBuilder();
        for(int i=0;i< strarr.length;i++){
            ans.append(strarr[i]);
        }
        return new String(ans);
    }
}
