import java.util.Scanner;

class HollowRectangle{
    public static void main(String[] args){
        int r, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows: ");
        r = sc.nextInt();

        System.out.print("Columns: ");
        c = sc.nextInt();

        for(int i=1; i<=r; i++){
            for(int j=1; j<=c; j++){
                if(i==1 || j==1 || i==r || j==c)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        


    }
}