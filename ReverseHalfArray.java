public class ReverseHalfArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        int half = n/2;
        int j=0;
        
        for(int i=half; i<half+(half/2); i++){
            int temp = arr[i];
            arr[i] = arr[n-1-j];
            arr[n-1-j] = temp;
            j++;
        }
        for(int e:arr){
            System.out.print(e);
        }

    }
}
