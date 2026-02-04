import java.util.Scanner;
public class ConvertKilometersInMiles{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the value in Kilometers : ");
	double kilometers = input.nextFloat();
	double Miles = kilometers / 1.6;
	System.out.println("The total miles is: "+Miles+" mile for the given:"+kilometers+"km");
	}
}
	