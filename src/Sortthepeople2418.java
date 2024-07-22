import java.lang.reflect.Array;
import java.util.*;
    /*
         You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.

        For each index i, names[i] and heights[i] denote the name and height of the ith person.

         Return names sorted in descending order by the people's heights.
          */

public class Sortthepeople2418{
    public static  void main(String[] args) {
        String []names={"Mary","John","Emma"};
         int []heights={180,165,170};

        HashMap<Integer,String>map=new HashMap<>();
        for (int i=0;i<heights.length;i++)
        {
            map.put(heights[i],names[i]);
        }
        String[]ans=new String[heights.length];
        Arrays.sort(heights);
         int k=0;
        for(int i=heights.length-1;i>=0;i--)
        {
            ans[k++]=map.get(heights[i]);
        }
        System.out.println(Arrays.toString(ans));
    }
}
