import java.util.Scanner;

public class LargestSmallestofMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][4];
        int rSize, cSize, i, j, largest, smallest;

        System.out.println("Enter the size of Row and Column of the matrix ");
        rSize = sc.nextInt();
        cSize = sc.nextInt();

        System.out.println("Enter the elements of the Matrix");
        for (i = 0; i < rSize; i++) {
            for (j = 0; j < cSize; j++) {
                arr[i][j] = sc.nextInt();
            }
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
        System.out.print("The largest element is : " + largest + "\nThe Smallest element is : " + smallest);
    }
}