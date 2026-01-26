import java.util.Scanner;
public class PowerWhile{
     public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a number:");
	 System.out.println("Enter a power:");
	 int number = sc.nextInt();
	 int power = sc.nextInt();
	 if(number>0){
	 System.out.println("The number is positive: "+number);
	 int result = 1;
	 int counter = 0;
	 while(counter!=power){
	 result = result*number;
	 counter++;
	 }
	 System.out.println(result);
	 }else{
		 System.out.println("The number is not positive");
	 }
	}
}