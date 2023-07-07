package bubbleSort;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int i, j, num, temp;
      Scanner userInput = new Scanner(System.in);
      System.out.println("Enter the number of elements to be sorted : ");
      num = userInput.nextInt();
      int array[] = new int[num];
      System.out.print("Enter "+num+ " elements : ");
      for(i=0; i<num; i++) {
    	  array[i] = userInput.nextInt();
      }
      for(i=0; i<num-1; i++) {
    	  for(j=0; j<num-i-1; j++) {
    		  if (array[j]<array[j+1]) {
    			  temp = array[j];
    			  array[j]=array[j+1];
    			  array[j+1] = temp;
    		  } 
    	  }
      }
      System.out.print("The sorted elements are : ");
      for(i=0; i<num; i++) {
    	  System.out.print(array[i]+" ");
      }
	}

}
