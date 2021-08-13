import java.util.Scanner;

public class SumofEachRowElement {
    public static void main (String[] args){
        Scanner sc  = new Scanner(System.in);
        int[][]arr = new int[4][4];
        int rSize, cSize, i, j, sum=0;

        System.out.println("Size of the Matrix (note: The maximum size is 4 * 4) : ");
        rSize = sc.nextInt();
        cSize = sc.nextInt();

        System.out.println("Enter the elements of the Matrix:");
        for ( i=0; i<rSize; i++){
            for ( j=0; j<cSize; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for ( i = 0; i < rSize; i++){
            sum=0;
            for ( j = 0; j < cSize; j++){
                sum += arr[i][j];
            }
            System.out.println("Sum of " + i + "th row is : " + sum);
        }
    }
}
