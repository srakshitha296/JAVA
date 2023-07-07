package selectionSort;

import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);

		System.out.println("Enter the size o the array : ");
		int size = userInput.nextInt();

		int[] array = new int[size];
		Random random = new Random();
		System.out.println("Populating array with random numbers : ");
		for (int i = 0; i < size; i++) {
			array[i] = random.nextInt();
		}

		System.out.print("Original Array : ");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\n--------------------Performing Selection Sort--------------------");

		long startTime = System.currentTimeMillis();
		selectionSort(array);
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		System.out.println("Sorted Array :");
		for (int num : array) {
			System.out.println(num + " ");
		}
		System.out.println("\nExecution time : " + executionTime + " milliseconds");
	}

	public static void selectionSort(int[] array) {
		int n = array.length;
		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			int temp = array[minIndex];
			array[minIndex] = array[i];
			array[i] = temp;
		}
	}

}
