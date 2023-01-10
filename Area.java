package LabProgram;

import java.util.Scanner;

public class Area {
	double length;
	double breadth;

	Area(double l, double b) {
		length = l;
		breadth = b;
	}

	double returnArea(double length, double breadth) {
		return (length * breadth);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);

		System.out.print("Enter the length : ");
		double length = userInput.nextDouble();
		System.out.print("Enter the breadth : ");
		double breadth = userInput.nextDouble();
		
		Area a = new Area( length, breadth);
		double area = a.returnArea(length, breadth);
		
System.out.println("Area of rectangle : " + area);

	}

}
