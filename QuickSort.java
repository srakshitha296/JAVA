package QuickSort;

import java.util.Random;
import java.util.Scanner;

public class QuickSort {
	public static void sort(int[] arr) {
		quickSort(arr, 0, arr.length-1);
	}
	
	public static void quickSort(int arr[], int low, int high) {
		int i=low, j=high;
		int temp;
		int pivot = arr[low];
		while(i<=j) {
			while(arr[i]<pivot)
				i++;
			while(arr[j]>pivot)
				j--;
			if(i<=j) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
		}
		if(low<j)
			quickSort(arr, low, j);
		if(i<high) 
			quickSort(arr, i, high);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Quick Sort Test\n");
		System.out.println("E3nter the size of the array : ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		Random random = new Random();
		System.out.println("Populating array with random numbers : ");
		for(int i=0; i<size; i++) {
			array[i] = random.nextInt();
		}
		System.out.println("Original Array : ");
		for(int i=0; i<size; i++) {
			System.out.println(array[i]+" ");
		}
		long startTime = System.currentTimeMillis();
		sort(array);
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		System.out.println("\nElements after Sorting ");
		for(int i=0; i<size; i++) {
			System.out.println(array[i]+" ");
		}
		System.out.println("Total time taken to sort the numbers is : "+executionTime+" Milliseconds");
		scanner.close();
	}

}
