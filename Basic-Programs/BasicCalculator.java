import java.util.Scanner;
public class BasicCalculator{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter number1:");
	System.out.println("Enter number2:");
	float number1 = input.nextFloat();
	float number2 = input.nextFloat();
	float addition = number1+number2;
	float subtraction = number1-number2;
	float multiplication = number1*number2;
	float division = number1/number2;
	System.out.println("The addition,subtraction,multiplication,division value of 2 numbers:"+number1+" and"+number2+" is:"+addition+","+subtraction+","+multiplication+" and"+division);
	}
	}
	