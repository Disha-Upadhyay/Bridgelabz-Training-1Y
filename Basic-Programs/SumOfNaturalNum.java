import java.util.Scanner;
public class SumOfNaturalNum{
     public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a number:");
	 int number = sc.nextInt();
	 if(number<=0){
	 System.out.println("The number is not natural:"+number);
	 }
	 int i=1;
	 double sumW = 0;;
	 while(i<=number){
	 sumW = sumW+i;
	 i++;
	}
	double sumF = number*(number+1)/2;
	System.out.println("Sum using while loop: "+sumW);
	System.out.println("Sum using formula: "+sumF);
	
	if(sumW==sumF){
	System.out.println("Both Sum are equal: ");
	}
    else{
	System.out.println("Both Sum are not equal: ");
    }
}
}