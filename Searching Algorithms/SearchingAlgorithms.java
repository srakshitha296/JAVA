class SearchingAlgorithms {
    //Linear Search
     void LinearSearch(int[] array, int key){
        for(int i=0; i<array.length; i++){
            if(key == array[i]){
                System.out.println("Element found in index " + i);
                return;
            }
        }
        System.out.println("Element not found");
    }

    //Binary Search -Iterative approach
    void BinarySearchI(int[] array, int key){
        int low = 0;
        int high = (array.length)-1;
        while(low<=high){
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

    // Binary Search -Recursive approach
    void BinarySearchR(int[] array, int low, int high, int key) {
        if (low > high) {
            System.out.println("Element not found");
            return;
        }

            int mid = (low + high) / 2;
            if (array[mid] == key) {
                System.out.println("Element found in index " + mid);
                return;
            } else if (key > array[mid])
                BinarySearchR(array, mid+1, high, key);
            else
                BinarySearchR(array, low, mid - 1, key);
        
    }

    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7,8};
        int key = 4;

        SearchingAlgorithms algo = new SearchingAlgorithms();

        System.out.println("LINEAR SEARCH");
        algo.LinearSearch(array, key);

        System.out.println("BINARY SEARCH - Iterative Approach");
        algo.BinarySearchI(array, key);

        System.out.println("BINARY SEARCH - Recursive Approach");
        algo.BinarySearchR(array, 0, array.length-1, key);
        
    }
}
