import java.util.Scanner;
public class ArmstrongNumber{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number:");
int number = sc.nextInt();
double sum = 0;
int originalNum = number;
while(number!=0){
sum = number%10;
sum = sum+(number*number*number);
number = number/10;
}
if(sum==originalNum){
System.out.println(originalNum+" is an armstrong number");
}else{
System.out.println(originalNum+" is not an armstrong number");
}
}
}