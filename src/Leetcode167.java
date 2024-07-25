import java.util.Arrays;

public class Leetcode167 {
    public static void main(String[] args) {

        int[]nums={-1,0};
        int target=-1;
        int[]ans=twoSum(nums,target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] twoSum(int []number,int target)
    {
        int[]ans=new int[2];
        int l=0;
         int r=number.length-1;
         while(l<r)
         {
             if(number[l]+number[r]==target)
             {
                 ans[0]=l+1;
                 ans[1]=r+1;
                 break;
             }
             else if(number[l]+number[r]<target)
             {
                 l++;
             }
             else {
                 r--;
             }
         }
         return ans;
    }
}
