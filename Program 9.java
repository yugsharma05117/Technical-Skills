/* Wap to read and print a user defined matrix and print sum of upper diagonal elements.

Algorithms:
1. Start
2. Read number of rows and columns from user.
3. create matrix using new int[rows][columns]
4. Read elements of matrix from user using nested loop.
5. Print the matrix using nested loop.
6. Calculate sum of upper diagonal elements 
(elements where row index < column index) and print it.
7. Stop

 */

import java.util.Scanner;
class Program9 {
    public static void main(String[] args) {
        int rows,cols,i,j;
        int sumupperdiagonal = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        cols = sc.nextInt();
        int [][] matrix = new int[rows][cols];
        System.out.println("Enter matrix elements: ");
        for (i = 0; i < rows; i++){
            for (j=0; j < cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is:");
        for (i = 0; i < rows; i++){
            for (j=0; j < cols; j++){
                System.out.print(matrix[i][j] + " ");
                if (i < j){
                    sumupperdiagonal += matrix[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("Sum of upperdiagonal elements: " + sumupperdiagonal);
        sc.close();
    }
}