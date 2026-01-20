import java.util.Scanner;
public class UniversityDiscount{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the fee:");
	System.out.println("Enter the discountPercent:");
	int fee = input.nextInt();
	float discountPercent = input.nextFloat();
	double discountAmount = (fee * discountPercent) / 100;
	double finalDiscount = fee - discountAmount;
	System.out.println("The discount amount is INR:"+discountAmount+" and final discounted fee is INR:"+finalDiscount);
	}
	}
	