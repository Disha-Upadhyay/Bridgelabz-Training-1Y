import java.util.Scanner;
public class AllMultiples{
     public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a number:");
	 int number = sc.nextInt();
	 
	 if(number>0){
	 System.out.println("The number is positive: "+number);
	 for(int i=100;i>=1;i--){
	  if(i%number==0){
	 System.out.println("if number is "+number+" true,print the number "+i);
	  }
	 }
	}else{
		 System.out.println("The number is not positive");
	}
   }
 }