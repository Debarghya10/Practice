import java.util.Scanner;

public class InterchangeFirst_and_LastRowOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][4];
        int rSize, cSize, i, j;

        System.out.println("Enter the size of Row and Column of the matrix ");
        rSize = sc.nextInt();
        cSize = sc.nextInt();

        System.out.println("Enter the elements of the Matrix");
        for (i = 0; i < rSize; i++) {
            for (j = 0; j < cSize; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The matrix you entered is : ");
        for (i = 0; i < rSize; i++) {
            for (j = 0; j < cSize; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }


        for (i = 0; i < rSize; i++) {
            int temp;
            temp = arr[0][0];
            arr[0][i] = arr[rSize - 1][i];
            arr[rSize - 1][i] = temp;
        }
        System.out.println("After Interchange of the First and Last row the matrix is ");
        for (i = 0; i < rSize; i++) {
            for (j = 0; j < cSize; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}