import java.util.Scanner;

public class Largest_Smallest_Arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array of size (" + n + "):");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int largest = a[0], smallest = a[0], secondLargest = a[0], secondSmallest = a[0];
        for (int i = 0; i < n; i++){
            if (a[i]>largest)
                largest = a[i];
            if (a[i]<smallest)
                smallest = a[i];
            if (a[i]>secondLargest && a[i]<largest)
                secondLargest = a[i];
            if (a[i] < secondSmallest && a[i] > smallest)
                secondSmallest = a[i];
            }
        System.out.println("Largest element is : " + largest + "\nSmallest Element is : " + smallest + "\nSecond Largest element is : " + secondLargest + "\nSecond Smallest element is : " + secondSmallest);
    }
}