/* Interchange the largest and the smallest element in a matrix */

import java.util.Scanner;

public class InterchangeLargestSmallest_Matrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][4];
        int rSize, cSize, i, j, largest, smallest;

        System.out.println("Enter the size of Row and Column of the matrix ");
        rSize = sc.nextInt();
        cSize = sc.nextInt();

        System.out.println("Enter the elements of the array of size (" + rSize + "*" + cSize + ")");
        for (i = 0; i < rSize; i++) {
            for (j = 0; j < cSize; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < rSize; i++) {
            for (j = 0; j < cSize; j++) {
                System.out.print(arr[i][j] + " ");      /* print the array in matrix format */
            }
            System.out.print("\n");
        }



        largest = smallest = arr[0][0];
        for (i = 0; i < rSize; i++) {
            for (j = 0; j < cSize; j++) {
                if (arr[i][j] > largest)
                    largest = arr[i][j];
                if (arr[i][j] < smallest)
                    smallest = arr[i][j];
            }
        }
        System.out.println("The largest element of the matrix is: " + largest + "\nThe smallest element of the matrix is: " + smallest + "\nAfter inter-changing the values of largest and Smallest is:");
        int temp = 0;
        temp = largest;
        largest = smallest;
        smallest = temp;

        System.out.println("Largest = " + largest + "\nSmallest = " + smallest);
    }
}