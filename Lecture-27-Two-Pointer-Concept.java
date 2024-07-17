//Two pointer concept for sorted array
import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the sum to be found");
        int x = sc.nextInt();
        int l=0;
        int r = arr.length-1;
        boolean found = false;
        while(l<r){
            int sum = arr[l]+arr[r];
            if(x==sum){
                System.out.println("Found the sum at indxes :"+l+","+r);
                found=true;
                break;
            }
            else if(x>sum){
                l++;
            }
            else{
                r--;
            }
        }
        if(!found){
            System.out.println("Sum not found");
        }
        
    }
    
}
