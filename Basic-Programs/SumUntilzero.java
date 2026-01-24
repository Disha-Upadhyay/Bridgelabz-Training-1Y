import java.util.Scanner;
public class SumUntilzero{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
double total = 0.0;
System.out.println("Enter a number:");
double number = sc.nextDouble();
while(number!=0){
total = total + number;
System.out.println("Enter a number:");
number = sc.nextDouble();
}
System.out.println("Sum of numbers: "+total);
}
}

