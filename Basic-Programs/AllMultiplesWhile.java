import java.util.Scanner;
public class AllMultiplesWhile{
     public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a number:");
	 int number = sc.nextInt();
	 
	 if(number>0){
	 System.out.println("The number is positive: "+number);
	 int i=100;
	 while(i>=1){
	  if(i%number==0){
	 System.out.println("if number is "+number+" true,print the number "+i);
	  }
	  i--;
	 }
	}else{
		 System.out.println("The number is not positive");
	}
   }
 }