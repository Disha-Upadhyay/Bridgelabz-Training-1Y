import java.util.Scanner;
public class Factorial{
     public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a number:");
	 int number = sc.nextInt();
	 if(number<0){
	 System.out.println("The number is not factorial");
	 }
	 int i = 1;
	 long factorial = 1;
	 while(i<=number){
	 factorial = factorial*i;
	 i++;
	 }
	 System.out.println("Factorial of"+number+" is:"+factorial);
	}
}