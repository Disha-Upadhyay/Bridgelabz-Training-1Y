import java.util.Scanner;
public class GreatestFactorsWhile{
     public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a number:");
	 int number = sc.nextInt();
	  int greatestFactor = 1;
	 
	 if(number>0){
	 System.out.println("The number is positive: "+number);
	 System.out.println("The factors are:");
	  int counter = number-1;
	 while(counter>=1){
	 if(number%counter==0){
	   greatestFactor = counter;
	    break;
	  }
	  counter--;
	 }
	  System.out.println(greatestFactor);
	}else{
		 System.out.println("The number is not positive");
	 }
   }
}