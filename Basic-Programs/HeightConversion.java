import java.util.Scanner;
public class HeightConversion{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the height:");
	double heightCm = input.nextDouble();
	double heightTotalInches = heightCm / 2.54;
    int heightFeet = (int)heightTotalInches / 12;
    double heightInches = heightTotalInches % 12;
    System.out.println("Your Height in cm is:"+heightCm+" while in feet is:"+heightFeet+" and inches is:"+heightInches);	
	}
	}