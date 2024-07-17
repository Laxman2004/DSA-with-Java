import java.util.*;

class ArrayDemos1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        int ar1[][] = {{1, 2, 3}, {4, 5, 6}};

        // Printing elements of ar1
        System.out.println("Elements of ar1:");
        for (int i = 0; i < ar1.length; i++) {
            for (int j = 0; j < ar1[i].length; j++) {
                System.out.print(" " + ar1[i][j]);
            }
            System.out.println();
        }

        
        for (int[] i : ar1) {
            System.out.println(Arrays.toString(i));
        }

        // Creating a jagged array
        int arr[][] = new int[3][];
        arr[0] = new int[1];
        arr[1] = new int[2];
        arr[2] = new int[3];

        // Taking input for the jagged array
        System.out.println("Enter values for jagged array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        // Printing the jagged array
        System.out.println("Elements of the jagged array:");
        for (int[] i : arr) {
            System.out.println(Arrays.toString(i));
        }

        scanner.close();
    }
}
