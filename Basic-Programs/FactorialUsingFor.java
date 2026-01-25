import java.util.Scanner;
public class FactorialUsingFor{
     public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a number:");
	 int number = sc.nextInt();
	 if(number<0){
	 System.out.println("The number is not factorial");
	 }
	 long factorial = 1;
	 for(int i=1;i<=number;i++){
	 factorial = factorial*i;
	 }
	 System.out.println("Factorial of"+number+" is:"+factorial);
	}
}