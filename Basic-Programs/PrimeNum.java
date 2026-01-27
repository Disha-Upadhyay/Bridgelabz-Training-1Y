import java.util.Scanner;
public class PrimeNum{
     public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a number:");
	 int number = sc.nextInt();
	 int count = 0;
	   for( int i=1;i<=number;i++){
	     if(number%i==0){
		    count++;
		 }
	   }
	   if(count==2){
	   System.out.println(" the number "+number+ " is a prime number ");
	 }else{
	   System.out.println(" the number "+number+ " is not a prime number ");
	 }
	}
}