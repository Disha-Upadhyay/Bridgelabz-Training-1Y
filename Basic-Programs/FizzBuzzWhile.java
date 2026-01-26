import java.util.Scanner;
public class FizzBuzzWhile{
     public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a number:");
	 int number = sc.nextInt();
	 if(number>0){
	 System.out.println("The number is positive");
	 }else{
		 System.out.println("The number is not positive");
	 }
	 int i = 1;
	 while(i<=number){
	     if(i%3==0 && i%5==0 ){
		 System.out.println("FizzBuzz");
		 }else if(i%3==0){
		 System.out.println("Fizz");
		 }else if(i%5==0 ){
		 System.out.println("Buzz");
		 }
		 else{
		 System.out.println(i);
		 }
		 i++;
	  }
	}
}
	 
	 