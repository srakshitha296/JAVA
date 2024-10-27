//Program to Che cck whether a number is even or odd without using division or % operator
//Bitwise AND operator can be used to check if a number is even. If the least significant bit (LSB) of a number is 0, the number is even.
public class EvenOdd{
public static void main(String[] args){
int n=6;
if((n & 1) == 1)
System.out.println("Odd");
else
System.out.println("Even");

}
}