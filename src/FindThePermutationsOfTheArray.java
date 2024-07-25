import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.swap;

public class FindThePermutationsOfTheArray {
    public static void main(String[] args) {
        int []arr={1,2,3};
        peemute(arr,0,arr.length-1);
    }
    public static void peemute(int[]arr,int l,int r)
    {
        if(l==r)
        {
//            System.out.println(Arrays.toString(arr));
        }
        else {
            for(int i=l;i<=r;i++ )
            {
                System.out.println(Arrays.toString(arr));
                swap(arr,l+1,r);
                peemute(arr,l+1,r);
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
