import java.util.Scanner;

public class PerfectSQRNoInArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];
        int size, squareROOT;

        System.out.println("Enter the size of the array");
        size = sc.nextInt();
        System.out.println("Enter the elements of the array of size (" + size + ")");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The perfect Square numbers are: ");
        for (int i = 0; i < size; i++) {
            squareROOT = (int) Math.sqrt(arr[i]);
            if ((squareROOT * squareROOT) == arr[i]) {
                System.out.print(arr[i] + "\t");
            }
        }
    }
}
