import java.util.Scanner;

public class InvertedHalfPyramidWithNumbers {
    public static void main(String[] args){
        int r;
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows: ");
        r = sc.nextInt();

        for(int i=5; i>=1; i--){
            for(int j=1; j<=i ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        


    }
}

