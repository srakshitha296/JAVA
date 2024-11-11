public class SearchingAlgorithms {
    //Linear Search
    public static int LinearSearch(int[] array, int key){
        for(int i=0; i<array.length; i++){
            if(key == array[i])
                return i;
        }
        return -1;
    }


    

    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7,8};

        System.out.print("LINEAR SEARCH");
        int index = LinearSearch(array, 4);
        if(index<0)
            System.out.print("Element not found");
        else    
            System.out.print("Element found in position "+index);
    }
}
