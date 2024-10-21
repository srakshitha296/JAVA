import java.util.Scanner;

class SolidRectangle{
    public static void main(String[] args){
        int n, m;
        System.out.println("Enter the value of n and m");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j =0; j<m; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}