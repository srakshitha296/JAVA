package Game;

import java.util.Random;

 class Factorial {

	int fact(int n) {
		if(n==0 || n==1)
			return 1;
		 return n*(fact(n-1));
	 }
	
}

public class Math {

	public static void main(String[] args) {
		
			Random r= new Random();
			int num = r.nextInt(10);
			
	Factorial f = new Factorial();
	int result = f.fact(num);
	
System.out.println("Factorial of "+num+ " is "+result);
	}

}
