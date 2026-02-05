/*
Given an array of integer A. 
Find and return the product array of the same size where the ith element of the product array will be equal to the product of all elements divided by the ith element of the array
 */

import java.util.Scanner;
class Program_4{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int product=1;
        for(int i=0;i<n;i++)
        {
            product*=arr[i];
        }
        int prod_arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            prod_arr[i]=product/arr[i];
        }
        System.out.println("Product array is: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(prod_arr[i]+" ");
        }
    }
}