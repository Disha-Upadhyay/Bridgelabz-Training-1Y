import java.util.Scanner;
public class PerimeterOfSquare{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the perimeter:");
	double perimeter = input.nextDouble();
	double side = perimeter/4;
	System.out.println("The length of side is:"+side+" whose perimeter is:"+perimeter);
	}
	}