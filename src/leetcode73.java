import java.util.HashSet;

public class leetcode73 {
    public static void main(String[] args) {
//        Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
//        You must do it in place.
        //this is not optimized code
        //this using hasset using extra space n+m
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] ans = new int[matrix.length][matrix[0].length];
        HashSet<Integer> row = new HashSet<>();
        HashSet<Integer> col = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (row.contains(i) || col.contains(j)) {
                    ans[i][j] = 0;
                } else {
                    ans[i][j] = matrix[i][j];
                }
            }
        }
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
        //method 2
        //this is other method to solve this problem space is o(1)

        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean fcol = false;
        boolean frow = false;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0)
                frow = true;
            break;
        }
        for (int i = 0; i < cols; i++) {
            if (matrix[0][i] == 0)
                fcol = true;
            break;
        }
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        if (frow) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
        if (fcol)
        {
            for(int i=0;i<matrix.length;i++)
            {
                matrix[0][i]=0;
            }
        }
        for (int i = 0; i <matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
