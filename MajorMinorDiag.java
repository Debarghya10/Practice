/* Sum of major and minor diagonal of a matrix */

import java.util.Scanner;

public class MajorMinorDiag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[5][5];
        int rSize, cSize, i, j, majorSum = 0, minorSum = 0;

        System.out.println("Enter the Row size and Column size : ");
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


        for (i = 0; i < rSize; i++) {
            for (j = 0; j < cSize; j++) {
                if (i == j) {
                    majorSum += arr[i][j];
                }
                if ((i + j) == 3) {
                    minorSum += arr[i][j];
                }
            }
        }
        System.out.println("Sum of Major Diagonal of the Matrix is = " + majorSum);
        System.out.println("Sum of Minor Diagonal of the Matrix is = " + minorSum);
    }
}