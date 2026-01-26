import java.util.Scanner;
public class GreatestFactors{
     public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a number:");
	 int number = sc.nextInt();
	  int greatestFactor = 1;
	 if(number>0){
	 System.out.println("The number is positive: "+number);
	 System.out.println("The factors are:");
	 for(int i = number-1;i>=1;i--){
	 if(number%i==0){
	   greatestFactor = i;
	    break;
	  }
	 }
	  System.out.println(greatestFactor);
	}else{
		 System.out.println("The number is not positive");
	 }
   }
}