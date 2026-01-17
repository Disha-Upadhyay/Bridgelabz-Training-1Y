import java.util.*;
public class PerimeterOfRectangle{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int l,w;
l=sc.nextInt();
w=sc.nextInt();
m1(l,w);
}
public static void m1(int length,int width){
double perimeter = 2 * (length + width);
System.out.println("Perimeter Of Rectangle = "+perimeter);
}
}