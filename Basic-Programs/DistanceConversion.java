import java.util.Scanner;
public class DistanceConversion{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the distanceinFeet:");
	double distanceinFeet = input.nextDouble();
    double distanceinYard = distanceinFeet/3;
    double distanceinmile = distanceinYard/1760;
    System.out.println("The distance in feet is:"+distanceinFeet+" while in yards is:"+distanceinYard+" and in miles is:"+distanceinmile);
}
}	