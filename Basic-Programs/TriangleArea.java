import java.util.Scanner;
public class TriangleArea{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the base:");
	System.out.println("Enter the height:");
	double base = input.nextDouble();
	double height = input.nextDouble();
	double areaInches = (1*base*height)/2;
	double areaCm = areaInches/6.4516;
	System.out.println("Area triangle in cm is:"+areaCm+" and inches is:"+areaInches);
	}
	}
	
	