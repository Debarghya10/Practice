import java.util.Scanner;

public class PrintMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[20][20];
        int sizeRow, sizeColumn;

        System.out.println("Enter the size of the Row of the array");
        sizeRow = sc.nextInt();
        System.out.println("Enter the size of the Column of the array");
        sizeColumn = sc.nextInt();
        System.out.println("Enter the elements of the array of size ([" + sizeRow + "][" + sizeColumn +"])");
        for (int i = 0; i < sizeRow; i++) {
            for (int j = 0; j < sizeColumn; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("The matrix you entered is arr[" + sizeRow + "][" + sizeColumn +"] is: { ");
        for (int i = 0; i < sizeRow; i++) {
            for (int j = 0; j < sizeColumn; j++) {
                System.out.print("\t" + arr[i][j] + " ");
            }
        }
        System.out.print("}");
    }
}
