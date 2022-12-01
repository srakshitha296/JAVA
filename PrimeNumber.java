
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		boolean isPrime = true;
		System.out.println("Enter a number to be checked : ");
		Scanner userInput = new Scanner(System.in);
		int number = userInput.nextInt();
		for(int i=2; i<=number/2; i++) {
			if(number%i==0) {
				isPrime = false;
			break;
		}
		}
		if(isPrime)  {
			System.out.println(number + " is a prime number.");
		}
		else
			System.out.println(number + " is a composite number.");
	}

}