import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Choose the operator number"
				+ "\n1. +"
				+ "\n2. -"
				+ "\n3. *"
				+ "\n4. /"
				+ "\n5. %"
				);
		Scanner userInput = new Scanner(System.in);
		int operator = userInput.nextInt(); 
		System.out.println("Enter the First Number");
		int num1 = userInput.nextInt();
		System.out.println("Enter the Second Number");
		int num2 = userInput.nextInt();
		
		switch(operator) {
		case 1  : System.out.println("Thee sum of " + num1 + " and " + num2 + " is " + (num1 + num2) );
		break;
		
		case 2  : System.out.println("Thee Difference of " + num1 + " and " + num2 + " is " + (num1 - num2) );
		break;
		case 3  : System.out.println("Thee Product of " + num1 + " and " + num2 + " is " + (num1 * num2) );
		break;
		case 4  :if(num2==0) 
			      System.out.println("Divide by zero error..!");
		     else
		          System.out.println("Thee Quotient obtained when " + num1 + " is Divided by  " + num2 + " is " + (num1 / num2) );
		break;
		case 5  :if(num2==0) 
                  System.out.println("Divide by zero error..!");
		      else
                  System.out.println("Thee Remainder obtained when  " + num1 + " is divided by " + num2 + " is " + (num1 % num2) );
		break;
		default : System.out.println("Invalid input!");
		}
			
			
	}

}
