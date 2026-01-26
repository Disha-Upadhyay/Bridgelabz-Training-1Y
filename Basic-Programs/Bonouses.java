import java.util.Scanner;
public class Bonouses{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a salary:");
System.out.println("Enter a year of service:");
double salary = sc.nextDouble();
int year = sc.nextInt();
double bonous = 0;
if(year>5){
bonous = (5*salary)/100;
}
System.out.println("the bonus amount:"+bonous);
}
}

 