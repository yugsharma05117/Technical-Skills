// Write a program to find the sum of frame elements of a matrix.

import java.util.*;
class twelve
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int rows,cols,j,i;
        int sum=0;
        System.out.print("Enter number of rows:");
        rows=sc.nextInt();

        System.out.print("Enter number of colums");
        cols= sc.nextInt();

        int [][] matrix=new int[rows][cols];

        System.out.print("Enter matrix element:");
        for (i=0;i<rows;i++)
            for(j=0;j<cols;j++){
                matrix[i][j]=sc.nextInt();
            }
        for (i=0;i<rows;i++)
        {
            for(j=0;j<cols;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        for (i=0;i<rows;i++)
            for(j=0;j<cols;j++){
                if (i==0 || j==0 || j==cols-1 || i==cols-1)
                {
                    sum+=matrix[i][j];
                }
            }
        System.out.print("Sum of Frame elements is:"+sum);
        sc.close();
    }
}

