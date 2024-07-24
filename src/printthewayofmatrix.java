import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class printthewayofmatrix {
    public static void main(String[] args) {
        int[][]matrix={{1,1,1},{1,0,1},{1,1,1}};
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(set.contains(i)||set.contains(j))
                {
                    matrix[i][j]=0;
                }
            }
        }
        System.out.println(Arrays.toString(matrix[1]));

    }
    public static Set<Integer> check(int [][]matrix, HashSet<Integer>set)
    {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    set.add(i);
                    set.add(j);
                }
            }
        }
        return set;
    }
}
