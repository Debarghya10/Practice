import java.util.Scanner;

public class PositiveNegetive {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        int[] arr = new int[20];
        int size, temp = 0;

        System.out.println("Enter the size odf the array");
        size = sc.nextInt();
        System.out.println("Enter the elements of the array of size (" + size + ") : (note: the array should contain positive and negetive numbers)");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i <=size; i++) {
            for (int j = 0; j <size; j++) {
                if ( arr[j]>0 && arr[j+1]<0){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("The required array arr[] is");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
}

