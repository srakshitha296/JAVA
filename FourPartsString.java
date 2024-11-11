public class FourPartsString {
    public  static void main(String[] args){
        String str = "abcdefgh";
        int size = str.length();

        if(size%4 != 0){
            System.out.println("Length of string should be a multiple of 4");
            return;
        }

        int part = size/4;

        StringBuilder temp = new StringBuilder();

        for(int i=0; i<size; i+=part){
            StringBuilder piece = new StringBuilder(str.substring(i, part+i));
            temp.append(piece.reverse());
        }               

        System.out.println(temp);
    }
    
}
