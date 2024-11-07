public class FourParts {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12};
        if(array.length%4 != 0){
            System.out.print("Array should be multiple of 4");
            return;
        }
        int part = array.length/4;

        for(int i=0; i<array.length; i += part){
            reverse(array, i, part-1+i);
        }

        for(int ele:array)
            System.out.print(ele+" ");

        
    }

    private static void reverse(int[] a, int start, int end){
        int temp;
        while(start<end){
            temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
    
}
