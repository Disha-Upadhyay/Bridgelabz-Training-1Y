import java.util.Scanner;
public class Division{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the number1:");
	System.out.println("Enter the number2:");
	int number1 = input.nextInt();
	int number2 = input.nextInt();
	double quotient= number1/number2;
	double remainder = number1%number2;
	System.out.println("The quotient is:"+quotient+" remainder is:"+remainder+" of two number:"+number1+" and"+number2);
	}
	}
	
	