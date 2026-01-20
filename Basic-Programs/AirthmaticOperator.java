import java.util.Scanner;
public class AirthmaticOperator{
    public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	double x = a+b;
	double y = a-b;
	double z = a*b;
	double p = a/b;
	double q = a%b;
	System.out.println("Addition"+x+" Subtraction"+y+" Multiplication"+z+" Division"+p+" Module"+q);
	}
}
