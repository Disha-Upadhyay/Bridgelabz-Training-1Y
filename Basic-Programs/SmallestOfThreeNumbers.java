import java.util.Scanner;
public class SmallestOfThreeNumbers{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number1:");
System.out.println("Enter the number2:");
System.out.println("Enter the number3:");
int number1 = sc.nextInt();
int number2 = sc.nextInt();
int number3 = sc.nextInt();
if(number1>number2){
System.out.println("Is the first number "+number1+" the smallest? yes");
}
else if(number1>number3){
System.out.println("Is the first number "+number1+" the smallest? yes");
}
else{
System.out.println("Is the first number "+number1+" the smallest? no");
}
}
}


