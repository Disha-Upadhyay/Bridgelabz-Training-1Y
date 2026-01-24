import java.util.Scanner;
public class LargestOfThreeNumbers{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number1:");
	System.out.println("Enter a number2:");
	System.out.println("Enter a number3:");
	int number1 = sc.nextInt();
	int number2 = sc.nextInt();
	int number3 = sc.nextInt();
	if(number1>number2 && number1>number3){
	System.out.println("Is the first number "+number1+" the largest? yes");
	}
	else if(number2>number1 && number2>number3){
	System.out.println("Is the second number "+number2+" the largest? yes");
	}
	else if(number3>number1 && number3>number2){
	System.out.println("Is the third number "+number3+" the largest? yes");
	}
	}
}
	