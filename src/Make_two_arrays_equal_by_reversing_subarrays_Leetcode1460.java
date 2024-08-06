public class Make_two_arrays_equal_by_reversing_subarrays_Leetcode1460 {
    public static void main(String[] args) {
        int []arr={1,2,3,4};
        int []target={2,4,2,3};
        int[]halper=new int[10001];
        for(int i=0;i<arr.length;i++)
        {
            halper[arr[i]]++;
            halper[target[i]]--;
        }
        for(int i=0;i<arr.length;i++) {
            if (halper[arr[i]] > 0)
            {
                System.out.println("False");
                return;
            }
        }
        System.out.println("true");
    }
}
