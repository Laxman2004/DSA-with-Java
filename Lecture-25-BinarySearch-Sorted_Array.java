//Binary search for "Sorted array"...

import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array.");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be find");
        int x = sc.nextInt();
        int left = 0;
        int right=arr.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(arr[mid]==x){
                System.out.println("Number found at index: "+mid);
                return;
            }
            else if(x<arr[mid]){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        System.out.println("Value was not found in the array");
    }
}
