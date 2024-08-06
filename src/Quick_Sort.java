import java.awt.*;
import java.util.Arrays;

public class Quick_Sort {
    public static void main(String[] args) {
        int []arr={2,3,5,7,1,6,4};
        Quick_Sort_(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void Quick_Sort_(int[] arr, int low, int hi) {
        if(low>=hi)
        {
            return;
        }
        int s= low;
         int e=hi;
         int mid=s+(e-s)/2;
         int pivot=arr[mid];
         while(s<=e)
         {
             while(arr[s]<pivot)
             {
                 s++;
             }
             while(arr[e]>pivot)
             {
                 e--;
             }
             if(s<=e)
             {
                 int temp=arr[s];
                 arr[s]=arr[e];
                 arr[e]=temp;
                 s++;
                 e--;
             }
         }
         Quick_Sort_(arr,low,e);
         Quick_Sort_(arr,s,hi);
    }
}
