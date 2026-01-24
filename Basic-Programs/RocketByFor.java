import java.util.Scanner;
public class RocketByFor{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a countdown number:");
int counter = sc.nextInt();
for(int i=counter;i>=1;i--){
System.out.println("The value of counter "+i);
}
}
}
