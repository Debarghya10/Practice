import java.util.Scanner;

public class Freq_Prime_Matrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][4];
        int rSize, cSize, i, j, factorCount = 0, primeCount = 0;

        System.out.println("Enter the size of Row and Column of the matrix ");
        rSize = sc.nextInt();
        cSize = sc.nextInt();

        System.out.println("Enter the elements of the Matrix");
        for (i = 0; i < rSize; i++) {
            for (j = 0; j < cSize; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (i = 0; i < rSize; i++) {
            for (j = 0; j <= rSize; j++) {
                if (arr[i][j] % j == 0)
                    factorCount++;
            }
            if (factorCount == 2)
                primeCount++;
        }
        System.out.println("Number of Prime Numbers in the matrix is : " + primeCount);

    }
}
