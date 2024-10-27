import java.util.Scanner;
public class InvertedHalfPyramidRotatedBy180 {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows: ");
        n = sc.nextInt();
        for(int i=1; i<=n; i++){
            //Inner loop for printing space
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            //Inner loop for printing *
            for(int j=1; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println();
    }

    }
}
