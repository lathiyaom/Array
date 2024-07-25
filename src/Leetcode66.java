import java.util.Arrays;

public class Leetcode66 {
    public static void main(String[] args) {
        int []digits={8,9,9};
        int []ans=new int[digits.length+1];
        for(int i=digits.length-1;i>=0;i--)
        {
            int carry=0;
             if(digits[i]+1<=9)
             {
                 ans[i]=digits[i]+=1;
                 break;
             }
             else {
                     digits[i] = (digits[i] + 1) % 10;
                     ans[i]=digits[i];
                      carry = (digits[i] + 1) / 10;
             }
            digits[i-1]+=carry;
             ans[i]=digits[i-1];
             if(digits[i-1]>9)
             {
                 ans[0]=carry;
             }
        }
        System.out.println(Arrays.toString(ans));
    }
}
