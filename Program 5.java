/*
given N array element check if there exist a pair where(i,j) such that  arr[i] + arr[j] == k and i!=j
Note: i and j are the index value and k is the given sum

Eg: arr=[3,-2,1,4,3,6,8] and k=10
Output: Pair exist
*/



/*
ALgorithm:
1. Take input from user for size of array and array elements
2. Take input from user for sum value k
3. Run a loop from 0 to n-1 and for each element run another loop from i+1 to n-1
4. Check if arr[i]+arr[j] is equal to k and i is not equal to j
5. If condition is true print "Pair exist" and return
6. If loop ends and no pair is found print "Pair does not exist"
*/



import java.util.Scanner;
class Program_5{
    public static void main(String agrs[])
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
        System.out.println("Enter the value of sum: ");
        int k=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(i!=j && arr[i]+arr[j]==k)
                {
                    System.out.println("Pair exist");
                    return;
                }
            }
        }
        System.out.println("Pair does not exist");
    }
}