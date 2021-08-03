import java.util.Scanner;
import java.util.Scanner.*;
public class ReverseArray {
    public static void main( String [] args){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array of size ("+n+"):");
        for (int i= 0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        for ( int i = n-1; i >= 0; i--){
            System.out.println(a[i]);
        }
    }
}
