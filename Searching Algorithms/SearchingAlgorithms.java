public class SearchingAlgorithms {
    //Linear Search
    public static void LinearSearch(int[] array, int key){
        for(int i=0; i<array.length; i++){
            if(key == array[i]){
                System.out.println("Element found in index " + i);
                return;
            }
        }
        System.out.println("Element not found");
    }

    //Binary Search -Iterative approach
    public static void BinarySearchI(int[] array, int key){
        int low = 0;
        int high = (array.length)-1;
        while(low<high){
            int mid = (low+high)/2;
            if(array[mid]==key){
                System.out.println("Element found in index " + mid);
                return;
            }
            else if(key>array[mid])
                low = mid+1;
            else
                high = mid-1;
        }
        System.out.println("Element not found");
    }

    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7,8};

        System.out.println("LINEAR SEARCH");
        LinearSearch(array, 9);

        System.out.println("BINARY SEARCH - Iterative Approach");
        BinarySearchI(array, 9);
        
    }
}
