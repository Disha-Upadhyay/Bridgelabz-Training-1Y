import java.util.Scanner;
public class BmiOfPerson{
     public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a weight(in kg):");
	 System.out.println("Enter a height(in cm):");
	 double weight = sc.nextDouble();
	 double heightCm = sc.nextDouble();
	 double heightM = heightCm/100.0;
	 double BMI = weight/(heightM*heightM);
	 if(BMI<=18.4){
	 System.out.println("Status:Underweight. if the weight(in kg) is "+weight+" and height(in cm) is "+heightCm);
	 }else if(BMI>=18.5 && BMI<=24.9){
	 System.out.println("Status:Normal. if the weight(in kg) is "+weight+"  and height(in cm) is "+heightCm);
	 }else if(BMI>=25.0 && BMI<=39.9){
	 System.out.println("Status:Overweight. if the weight(in kg) is "+weight+" and height(in cm) is "+heightCm);
	 }else{
	 System.out.println("Status:Obese. if the weight(in kg) is "+weight+" and height(in cm) is "+heightCm);
	 }
	 
	}
}