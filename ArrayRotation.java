import java.util.ArrayList;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int n = array.length;
        System.out.print("Enter the rotation num :");
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();

        // int[] temp = new int[n];

        // for(int i=0; i<n-d; i++){
        // temp[i] = array[d+i];
        // }

        // for (int i = 0; i < d; i++) {
        // temp[n-d+i] = array[i];
        // }

        // for(int i=0; i<n-1; i++){
        // array[i] = temp[i];
        // }

        for(int i=0; i<d; i++){
        int first = array[0];
        for(int j=0; j<n-1; j++){
        array[j]=array[j+1];
        }
        array[n-1]=first;
        }

        for(int ele:array){
        System.out.println(ele);
        }

    }
}
