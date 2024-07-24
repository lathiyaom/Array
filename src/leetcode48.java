public class leetcode48 {
    public static void main(String[] args) {
        //You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
        //You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
        //space is o(1) ans time is o(n^2)
        int[][]matrix={{1,2,3},{4,5,6},{7,8,9}};
        int     top=0;
         int bottom =matrix.length-1;
        while (top < bottom) {
            for (int col = 0; col < matrix.length; col++)
            {
                int temp=matrix[top][col];
                matrix[top][col]=matrix[bottom][col];
                matrix[bottom][col]=temp;
            }
            top++;
            bottom--;
        }
        for(int row=0;row< matrix.length;row++)
        {
            for(int col=row+1;col<matrix.length;col++)
            {
                int temp=matrix[row][col];
                matrix[row][col]=matrix[col][row];
                matrix[col][row]=temp;
            }
        }
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix.length;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
