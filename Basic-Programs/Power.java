import java.util.Scanner;
public class Power{
     public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a number:");
	 System.out.println("Enter a power:");
	 int number = sc.nextInt();
	 int power = sc.nextInt();
	 if(number>0){
	 System.out.println("The number is positive: "+number);
	 int result = 1;
	 for(int i=1;i<=power;i++){
	 result = result*number;
	 }
	 System.out.println(result);
	 }else{
		 System.out.println("The number is not positive");
	 }
	}
}