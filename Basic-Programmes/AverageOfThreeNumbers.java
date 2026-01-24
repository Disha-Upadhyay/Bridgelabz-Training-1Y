import java.util.*;
public class AverageOfThreeNumbers{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int a,b,c;
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
m1(a,b,c);
}
public static void m1(int a,int b,int c){
double Average = (a+b+c)/3;
System.out.println("Average Of Three Numbers = "+Average);
}
}