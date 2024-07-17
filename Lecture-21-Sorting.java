// Finding the Index of Max and Min elements

// import java.util.*;
// class Main{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int a[]=new int[n];
//         for(int i=0;i<n;i++){
//              a[i]=sc.nextInt();
//         }
//         int min = a[0];
//         int min_Index=0;
//         for(int i=0;i<n;i++){
//             if(a[i]<min){
//                 min=a[i];
//                 min_Index=i;
//             }
//         }
//         int max=a[0];
//         int max_Index=0;
//         for(int i=0;i<n;i++){
//             if(a[i]>max)
//             {
//                 max=a[i];
//                 max_Index=i;
//             }
//         }
//          System.out.println(max);
//         System.out.println(max_Index);
//         System.out.println(min);
//         System.out.println(min_Index);
//     }
// }

// Sorting the given array

import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            int min_Index = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_Index]){
                    min_Index=j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_Index];
            arr[min_Index]=temp;
        }
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
