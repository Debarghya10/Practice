import java.util.Scanner;

public class LargestCompositeInArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[] arr = new int[10];

        int c = 0, flag = 0, largestComposite = 0;


        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the array of size (" + size + ")");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            c = 0;
            for (int j = 1; j <= arr[i]; j++) {
                if (arr[i] % j == 0) {
                    c++;
                }
            }
            if (c > 2) {
                if (flag == 0) {
                    largestComposite = arr[i];
                    flag = 1;
                }
                if (arr[i] > largestComposite) {
                    largestComposite = arr[i];
                }
            }
        }
        System.out.println("The largest composite number in the Array arr["+size+"] = "+ largestComposite);
    }
}