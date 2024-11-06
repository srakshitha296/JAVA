public class MinMax {
    public static void main(String[] args){
        int[] arr = {8,4,2,1,0};
        int min = 999;
        int max = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max)
                max = arr[i];
            if(arr[i]<min)
                min = arr[i];
        }

        System.out.print("Maximum : "+max+"\nMinimum : "+min);
        
    }
    
}
