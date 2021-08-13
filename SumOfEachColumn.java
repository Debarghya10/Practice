import java.util.Scanner;

public class SumOfEachColumn {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[5][5];
        int rSize, cSize, i, j, sum=0;

        System.out.println("Enter the Row size and Column size : ");
        rSize = sc.nextInt();
        cSize = sc.nextInt();

        System.out.println("Enter the elements of the array of size 4*4 ");
        for (i=0; i<rSize; i++){
            for (j=0; j<cSize; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The Sum of each column is");
        for (i=0; i<rSize; i++) {
            sum = 0;
            for (j = 0; j < cSize; j++) {
                sum += arr[j][i];
            }
            System.out.println((i+1) + "th Column sum is = " + sum);
        }
    }
}
