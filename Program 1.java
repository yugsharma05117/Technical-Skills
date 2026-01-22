//Question 1- Given an array count no. of elements having atleast one element greater than itself

class Program1{
    public static void main(String[] args){
        int[] arr={-1, 3, 5, 11, 2, 6};
        int count=0;
        int n=arr.length;
        int max=arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0; i<n; i++){
            if(arr[i]<max){
                count++;
            }
        }
        System.out.println("Count of elements having atleast one element greater than itself: "+count);
    }
}
/*
Observation: For every maximum element there wont be any element greater than itself.

Pseudo Code:
1. Iterate and find the maximum element of the array.
2. Terate and get the number of elements which are not equal to maximum element.
*/