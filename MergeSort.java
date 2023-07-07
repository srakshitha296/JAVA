package mergeSort;

import java.util.Random;
import java.util.Scanner;

public class MergeSort {
	/*Merge Sort Function*/
	public static void sort(int[] a, int low, int high) {
		int N = high-low;
		if(N<=1)
			return;
		int mid = low+ N/2;
		//Recursively Sort
		sort(a, low, mid);
		sort(a, mid, high);
		//merge two sorted subarrays
		int[] temp = new int[N];
		int i=low, j=mid;
		for(int k=0; k<N; k++) {
			if(i==mid)
				temp[k]=a[j++];
			else if(j == high)
				temp[k]=a[i++];
			else if(a[j]<a[i])
				temp[k]=a[j++];
			else 
				temp[k]=a[i++];
		}
		for(int k = 0; k<N; k++)
			a[low+k]=temp[k];
	}
	/*Main Method*/
	public static void main(String[] args) {
		Scanner userInput= new Scanner(System.in);
		System.out.println("Merge Sort Test\n");
		System.out.println("Enter the size of the array: ");
		int size = userInput.nextInt();
		int[] array = new int[size];
		Random random = new Random();
		System.out.println("Populating array with random numbers...");
		for(int i=0; i<size; i++) {
			array[i]=random.nextInt();
		}
		System.out.println("Original Array: ");
		for(int i=0; i<size; i++) {
				System.out.println(array[i]+" ");
		}
		long startTime=System.currentTimeMillis();
		
		sort(array, 0, size);
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		
		/**Print Sorted Array**/
		System.out.println("/n Elements after Sorting : ");
		for(int i=0; i<size; i++) {
		System.out.println(array[i]+" ");
		}
		System.out.println("Total time taken to sort the numbers is : "+executionTime+" Milliseconds.");
		userInput.close();
	}
}


