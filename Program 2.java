/* Ques.: Equilibrium index
Given N array elements, count the number of equilibrium index.
An index is said to be an equilibrium index 
if the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
*/

/*
Eg:
no. of array: 7
Array Elements: 3 -1 2 -1 1 2 1
No. of equilibrium indixes: 2
*/

/*
Algorithm:
1. Read the array and find it's length n.
2. Create a prefix sum array and the cumulative sum of the array.
3. initialise count=0
4. calculate the sum of left sum(ls)
if i = =0 then ls=0
else ls=pf[i-1]
5. calculate the sum of right sum(rs)
rs=pf[n-1]-pf[i]
6. compare 
if ls==rs then count++
*/


import java.util.Scanner;

class Equilibrium123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] pf = new int[n];
        pf[0] = arr[0];

        for (int i = 1; i < n; i++) {
            pf[i] = pf[i - 1] + arr[i];
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            int leftSum;
            int rightSum;

            if (i == 0) {
                leftSum = 0;
            } else {
                leftSum = pf[i - 1];
            }

            rightSum = pf[n - 1] - pf[i];

            if (leftSum == rightSum) {
                count++;
            }
        }

        System.out.println("Number of equilibrium indixes: " + count);
        sc.close();
    }
}


