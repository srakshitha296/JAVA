import java.util.Scanner;
class FloydsTriangle {
    public static void main(String[] args){
        int n;
        System.out.println("Rows : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int number = 1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
    
}
