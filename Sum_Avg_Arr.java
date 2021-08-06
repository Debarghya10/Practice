import java.util.Scanner;

public class Sum_Avg_Arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a[] = new float[10];
        float sum=0;
        float avg = 0;
        System.out.println("Enter the size of the array");
        float n = sc.nextInt();
        System.out.println("Enter the elements of the array of size (" + n + "):");
        for ( int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++){
            sum = sum + a[i];
        }
        System.out.println("Sum ="+sum);
        System.out.println("Average ="+ (avg = sum/n));
    }
}