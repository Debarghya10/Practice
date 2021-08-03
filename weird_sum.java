import java.util.Scanner;

public class weird_sum {
    public static void main( String [] args){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        int i, n, sum = 0;
        System.out.println("Enter size of the array: ");
        n = sc.nextInt();
        System.out.println("Enter the elements of the array of size("+n+")");
        for(i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(i = 0;i < n; i++) {
            int wSum = 0;
            for (int j = 0; j < n; j++) {
                    if (a[i] != a[j]) {
                    wSum = wSum + a[j];
                }
                else{
                    wSum = wSum + a[j] - a[i];
                }
            }
            System.out.println("weird-sum (" + a[i] + ") = " + wSum);
        }
    }
}
