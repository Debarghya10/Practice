/* Create 2 array P & Q of size n and merge them into array R */

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrP = new int[10];
        int[] arrQ = new int[10];
        int[] arrR = new int[20];
        int sizeP, sizeQ, i, c = 0;

        System.out.println("Enter the size of the array P");            /* Array P : input size and elements */
        sizeP = sc.nextInt();
        System.out.println("Enter the elements of the array P[]");
        for (i = 0; i < sizeP; i++) {
            arrP[i] = sc.nextInt();
        }

        System.out.println("Enter the size of the array Q");            /* Array Q : input size and elements */
        sizeQ = sc.nextInt();
        System.out.println("Enter the elements of the array Q[]");
        for (i = 0; i < sizeQ; i++) {
            arrQ[i] = sc.nextInt();
        }


        for (i = 0; i < sizeP; i++) {                                   /* Merge array P into R */
            arrR[c] = arrP[i];
            c++;
        }

        for (i = 0; i < sizeQ; i++) {                                   /* Merge array Q into R */
            arrR[c++] = arrQ[i];
        }


        System.out.print("The Merged array arrR[] is : {");           /*Print R as the final merged array*/
        for (i = 0; i < c; i++) {
            System.out.print(arrR[i] + " ");
        }
        System.out.print("}");
    }
}