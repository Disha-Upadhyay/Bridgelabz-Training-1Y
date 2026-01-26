import java.util.Scanner;
public class Multiplication{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number:");
int number = sc.nextInt();
for(int i=6;i<=9;i++){
double multiplication = number*i;
System.out.println("the multiplication of numbert "+number+" x "+i+ "is "+multiplication);
}
}
}
