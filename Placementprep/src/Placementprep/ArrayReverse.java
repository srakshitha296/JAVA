package Placementprep;

import java.util.Scanner;

public class ArrayReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int[] original= new int[size];
		for(int i=0; i<size; i++) {
			original[i] = sc.nextInt();
		}
		sc.close();
		
		arrayReverse(original);
	}

	private static void arrayReverse(int[] arr) {
		// TODO Auto-generated method stub
		int[] reverse = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			reverse[i] = arr[arr.length-i-1];
		}
		
		System.out.println("Reversed Array");
		for(int i=0; i<reverse.length; i++) {
			System.out.println(i+" ");
		}
	}
}
