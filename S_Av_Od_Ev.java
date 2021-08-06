import java.util.Scanner;

public class S_Av_Od_Ev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a[] = new float[10];
        float sumE = 0, sumO=0;
        float avgE = 0, avgO=0;
        int i, cE=0, cO=0;
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array of size (" + n + "):");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                sumE = sumE + a[i];
                cE++;
                avgE = sumE / cE;
            }
            else {
                sumO = sumO + a[i];
                cO++;
                avgO = sumO / cO;
            }
        }
        System.out.println("Sum of all the even elements = " + sumE + " and Average of all the odd elements = " + avgE);
        System.out.println("Sum of all the odd elements = " + sumO + " and Average of all the odd elements = " + avgO);
    }
}