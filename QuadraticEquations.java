package LabProgram;

import java.util.Scanner;

public class QuadraticEquations{

	public static void main(String[] args) {
	Scanner userInput = new Scanner(System.in);
	
	System.out.println("Enter the value of a, b and c");
	double a = userInput.nextDouble();
	double b = userInput.nextDouble();
	double c = userInput.nextDouble();
	
	if(a == 0 && b == 0) 
		System.out.println("Roots cant be computed !");
	else if (a==0) 
		System.out.println("Root = " + (-c/b) );
	else {
		double d = ( b*b - (4*a*c));
		if(d == 0)
		{
			double root = -b/(2*a);
			System.out.println("Roots are real and equal\nRoot1 = Root2 =" +root);
		}
		else if(d>0)
		{
			System.out.println("Roots are real and distinct");
			double root1 = (-b + Math.sqrt(d) )/ (2*a);
			double root2 = (-b - Math.sqrt(d) )/ (2*a);
			System.out.println("Root1 = "+root1+ " Root2 = " +root2);
		}
		else 
		{
			System.out.println("Roots are Imaginary!");
	}

	}
}
}
