import java.util.Scanner;
public class HarshadNumber{
     public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a number:");
	 int number = sc.nextInt();
	 int sum =0;
	 while(number!=0){
	  int digit = number%10;
	  sum = sum+number;
	  number = number/10;
	  }
	  if(number%sum==0){
	  System.out.println("Harshad number");
	  }else{
	  System.out.println(" Not a Harshad number");
	  }
	 }
	}