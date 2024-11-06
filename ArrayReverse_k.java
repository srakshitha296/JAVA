import java.util.Scanner;

class ArrayReverse_k {
    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int n = array.length;
        int k = 5;
        if (k > n) {
            System.out.print("Invalid");
        } else {

            int temp;
            for (int i = 0; i < k / 2; i++) {
                temp = array[i];
                array[i] = array[k - 1 - i];
                array[k - 1 - i] = temp;
            }

            for (int i : array) {
                System.out.print(i);
            }
        }
    }
}