import java.util.Arrays;

public class Kth_Largest_Element {
    public static void main(String[] args) {
        int[]arr={100,2,3,1,2,3,4,2,6,12,8};
        int k=3;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                     int temp=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=temp;
                }
            }
            if(i+1==k)
            {
                break;
            }
        }
        System.out.println(arr[arr.length -k]);
    }
}
