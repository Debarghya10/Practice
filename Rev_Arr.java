import java.util.Scanner;

public class Rev_Arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        System.out.println("Enter the size of the array ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array of size (" + n + "): ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0, j = n-1; i < j; i++, j--) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        System.out.print("The Reversed Array is Rev_Arr[] = { ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.print("}");
    }
}