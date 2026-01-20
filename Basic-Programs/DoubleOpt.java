import java.util.Scanner;
public class  DoubleOpt{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a:");
	System.out.println("Enter b:");
	System.out.println("Enter c:");
	double a = input.nextDouble();
	double b = input.nextDouble();
	double c = input.nextDouble();
	double result1 = a+b*c;
	double result2 = a*b+c;
	double result3 = c+a/b;
	double result4 = a%b+c;
	System.out.println("The result of Double Operation are:"+result1+","+result2+","+result3+" and"+result4);
	}
	}
	
	