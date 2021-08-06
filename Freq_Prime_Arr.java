import java.util.Scanner;

public class Freq_Prime_Arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0, count = 0;
        int[] a = new int[10];
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array of size (" + n + "):");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            c=0;
            for (int j = 1; j <= a[i]; j++) {
                if (a[i] % j == 0) {
                    c++;
                }
            }
            if (c == 2)
                count++;
        }
        System.out.println("Frequency of prime numbers in the array is :" + count);
    }
}