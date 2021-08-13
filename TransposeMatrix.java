import java.util.Scanner;

public class TransposeMatrix {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][4];
        int rSize, cSize, i, j;

        System.out.println("Enter the size of Row and Column of the matrix ");
        rSize = sc.nextInt();
        cSize = sc.nextInt();

        System.out.println("Enter the elements of the Matrix");
        for ( i=0; i<rSize; i++){
            for (j=0; j<cSize; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Transpose of the Matrix is: ");
        for ( i=0; i<rSize; i++){
            for (j=0; j<cSize; j++){
                System.out.print(arr[j][i] + " ");
            }
            System.out.print("\n");
        }
    }
}
