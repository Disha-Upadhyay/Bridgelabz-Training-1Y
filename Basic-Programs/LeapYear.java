import java.util.Scanner;
public class LeapYear{
     public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a year:");
	 int year = sc.nextInt();
	 if(year>=1582){
	 
	 if(year%4==0){
	 System.out.println("The year "+year+ " is leap year.");
	 }else if(year%100==0){
	 System.out.println("The year "+year+ " is not leap year.");
	 }else if(year%400==0){
	 System.out.println("The year "+year+ " is leap year.");
	 }else{
	 System.out.println("The year "+year+ " is not leap year.");
	 }
	 }else{
	 System.out.println("The year is not in the georgian calender.");
	 }
	}
}