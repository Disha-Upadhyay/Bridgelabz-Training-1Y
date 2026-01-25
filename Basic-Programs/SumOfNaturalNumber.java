import java.util.Scanner;
public class SumOfNaturalNumber{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number:");
int number = sc.nextInt();
if(number<=0){
System.out.println("The number  is not natural:"+number);
}
double sumW = 0;
for(int i=1;i<=number;i++){
sumW = sumW + i;
}
double sumF = number*(number+1)/2;
System.out.println("Sum using for loop: "+sumW);
System.out.println("Sum using formula: "+sumF);

if(sumW==sumF){
System.out.println("Both Sum are equal: ");
}
else{
System.out.println("Both Sum are not equal: ");
}
}
}