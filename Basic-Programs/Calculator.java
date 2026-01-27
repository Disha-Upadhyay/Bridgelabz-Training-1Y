import java.util.Scanner;
public class Calculator{
     public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
	 int number = 1;
	 System.out.println("Enter a first:");
	 System.out.println("Enter a second:");
	 double first = sc.nextDouble();
	 double second = sc.nextDouble();
	 System.out.println("Enter a op(+,-,*,/):");
	 String op = sc.next();
	 for(int i=1;i<=number;i++){
	     switch(op){
		     case "+":
			     System.out.println("Result:"+ (first+second));
				 break;
			 case "-":
			     System.out.println("Result:"+ (first-second));
			     break;
			 case "*":
			     System.out.println("Result:"+ (first*second));
			     break;
			 case "/":
			     if(second!=0){
			     System.out.println("Result:"+ (first/second));
			     }else{
				 System.out.println("cannot divide by zero");
				 }
				 break;
			 default:
			     System.out.println("Invalid operator");
			}
		}
	}
}