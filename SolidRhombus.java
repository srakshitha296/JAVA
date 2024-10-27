import java.util.Scanner;
class SolidRhombus{
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows : ");
        n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j = n-1; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}