package LabProgram;

import java.util.Scanner;

public class StudentDetails {
	String usn;
	String name;
	String branch;
	long phoneNo;
	StudentDetails(String u, String n, String b, long ph) {
		usn = u;
		name = n;
		branch = b;
		phoneNo = ph;
		 
	}

	public static void main(String[] args) {
		String u, n, b;
		long ph;
		System.out.println("Enter the number of Students : ");
		Scanner userInput = new Scanner(System.in);
		int noOfStudents = userInput.nextInt();
		StudentDetails s[] = new StudentDetails[10];
		for(int i=0; i < noOfStudents; i++) {
			System.out.println("Enter usn of student " + i+1 );
			u = userInput.next();
			System.out.println("Enter name of student " + i+1 );
			n = userInput.next();
			System.out.println("Enter branch of student " + i+1 );
			b = userInput.next();
			System.out.println("Enter phone no of student " + i+1 );
			ph = userInput.nextLong();
			
			s[i] = new StudentDetails(u, n, b, ph);
		}
		
		System.out.println("----------STUDENT DETAILS----------");
		System.out.println("USN\t\t\tNAME\t\t\tBRANCH\t\t\tPHONE NUMBER");
		for(int i=0; i < noOfStudents; i++) {
			System.out.println(s[i].usn+ "\t\t\t" +s[i].name+ "\t\t\t" +s[i].branch+ "\t\t\t"+s[i].phoneNo);
		}
		
	}

}
