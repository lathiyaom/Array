package Leetcode;

import java.util.ArrayList;

public class leetcode54 {
    public static void main(String[] args) {

        int[][]matrix={{1,2,3},{4,5,6}};
        ArrayList<Integer>arrayList=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int rows =0;
        int rend=n-1;
         int cols=0;
          int colend=n-1;
          while(rows<=rend && cols<=colend)
          {
              for(int col=cols;col<=colend;col++)
              {
                  arrayList.add(matrix[rows][col]);
              }
              rows++;
              for(int row=rows;row<=rend;row++)
              {
                  arrayList.add(matrix[row][colend]);
              }
              colend--;
              if(rows<=rend)
              {
                  for(int col=colend;colend>=cols;col--)
                  {
                      arrayList.add(matrix[rend][col]);
                  }
                  rend--;
              }
              if(cols<=colend)
              {
                  for(int row=rend;row>=rows;row--)
                  {
                      arrayList.add(matrix[row][cols]);
                  }
                  cols++;
              }
              System.out.println(arrayList);
          }
    }
}
