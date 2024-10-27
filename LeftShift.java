//Division without using division operator
import java.util.Scanner;
public class LeftShift{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.print("Dividend : ");
int dividend = sc.nextInt();

System.out.print("Divisor : ");
int divisor = sc.nextInt();

if(divisor == 0){
throw new ArithmeticException("Divide by zero");
}

int result = 0;
int multiple = 1;
int tempDivisor;

while(dividend >= divisor){

tempDivisor = divisor;
multiple = 1;

while (dividend >= (tempDivisor << 1)) {
tempDivisor <<= 1;
multiple <<= 1;
}

dividend -= tempDivisor; 
result += multiple;

}
 System.out.print("Quotient : "+result);
}
}