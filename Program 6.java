/*
You are given an integer array A.
You have to find the second largest element/value in the array to report that no such element exists.

Eg: arr=[10,20,40,30,60]
Output: Second largest element is: 40
*/

import java.util.Scanner;
class Program_6{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max1=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max1)
            {
                max1=arr[i];
            }
        }
        int max2=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max2 && arr[i]<max1)
            {
                max2=arr[i];
            }
        }
        if(max2==-1)
        {
            System.out.println("No second largest element");
        }
        else
        {
            System.out.println("Second largest element is: "+max2);
        }
    }
}