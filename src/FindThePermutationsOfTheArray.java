import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.swap;

public class FindThePermutationsOfTheArray {
    public static void main(String[] args) {
        int []arr={1,2,3};
        permute(arr,0,arr.length-1);
    }
    public static void permute(int[]arr,int l,int r)
    {
        if(l==r)
        {
            System.out.println(Arrays.toString(arr));
        }
        else {
            for(int i=l;i<=r;i++ )
            {
                swap(arr,l+1,r);
                permute(arr,l+1,r);
              swap(arr,l,r);
            }
        }
    }
    public static void swap(int[]arr,int l, int r)
    {
         int temp=arr[l];
         arr[l]=arr[r];
         arr[r]=temp;
    }
}
