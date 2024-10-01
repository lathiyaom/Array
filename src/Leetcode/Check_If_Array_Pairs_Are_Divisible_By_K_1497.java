package Leetcode;

public class Check_If_Array_Pairs_Are_Divisible_By_K_1497 {
    public static void main(String[] args) {

    }


    public static boolean canArrange(int[] arr, int k) {
    int []map=new int[k];
    for(int a:arr)
    {
        int rem=((a%k)+k)%k;
        map[rem]++;
    }
    if(map[0]%2!=0)return false;
    for(int rem=1;rem<=k/2;rem++)
    {
        int comp=k-rem;
        if(map[rem]!=map[comp])return false;
    }
    return true;
    }
}
