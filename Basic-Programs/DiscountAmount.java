public class DiscountAmount{
    public static void main(String[] args){
	int fee = 125000;
	double discountPercent = 10;
	double discountAmount= (125000*10)/100;
	double  finalDiscount = fee - discountAmount;
	System.out.println("The discount amount is INR:"+discountAmount+" and final discounted fee is INR:"+finalDiscount);
	}
	}