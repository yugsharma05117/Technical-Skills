/*
Given an integer array of size N. In 1 second you can increase the value of 1 element by 1. 
Find the minimum time in seconds to make all elements of the array equal.
 */

/*
Steps:
> 1. Find the max element in the array.
> 2. for every element , calculate how much it needs to be increase to reach the maximum.
> 3. sum of all those difference.
time=0
time=time+(max-arr[i])
 */
import java.util.Scanner;
class Program_3{
    public static void main(String[] args) {
        int max=0;
        int time=0;
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for (int i=0;i<n;i++){
            time=time+(max - arr[i]);
        }
        System.out.println("Minimum time required: "+time);
        sc.close();
    }
}

// Eg: Input: [2,4,3,1,2]
// Output: 8
// Explanation: Max element is 4. The differences are (4-2)+(4-4)+(4-3)+(4-1)+(4-2) = 2+0+1+3+2 = 8.