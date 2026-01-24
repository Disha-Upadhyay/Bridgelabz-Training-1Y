import java.util.*;
public class KilometersToMiles{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int k;
k=sc.nextInt();
m1(k);
}
public static void m1(int Kilometers){
double miles = Kilometers * 0.621371;
System.out.println("Kilometers to Miles = "+miles);
}
}