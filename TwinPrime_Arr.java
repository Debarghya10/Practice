import java.util.Scanner;

public class TwinPrime_Arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int size, i, j, b = 0, c = 0;
        System.out.println("Enter the size of the array");
        size = sc.nextInt();
        System.out.println("Enter the elements of the array of size (" + size + ")");
        for (i = 0; i < size; i++)
            arr[i] = sc.nextInt();
        System.out.println(" Twin Prime number of this array is : ");
        for (i = 0; i < size; i++) {
            c = 0;
            for (j = 1; j <= arr[i]; j++) {
                if (arr[i] % j == 0)
                    c++;
            }
            if (c == 2) {
                if (((arr[i] - b == 2) || (b - arr[i] == 2)) && (arr[i] != 2))
                    System.out.println( b +" and "+ arr[i] );
                else{
                    b= arr[i];
                }
            }
        }
    }
}
