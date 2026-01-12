import java.util.*;
public class PowerCalculation{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int a,b;
a=sc.nextInt();
b=sc.nextInt();
m1(a,b);
}
public static void m1(int a,int b){
double power = Math.pow(a,b);
System.out.println("Power Calculation = "+power);
}
}