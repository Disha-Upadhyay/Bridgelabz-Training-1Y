import java.util.Scanner;
public class YoungestFriend{
     public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a age and height of amar:");
	 int age1 = sc.nextInt();
	 double height1 = sc.nextDouble();
	 System.out.println("Enter a age and height of akbar:");
	 int age2 = sc.nextInt();
	 double height2 = sc.nextDouble();
	 System.out.println("Enter a age and height of anthony:");
	 int age3 = sc.nextInt();
	 double height3 = sc.nextDouble();
	 double smallest = 0;
	 if(age1<age2 && age1<age3){
	  smallest = age1;
	  System.out.println("Amar is smallest among three of them.");
	 }else if(age2<age1 && age2<age3){
	    smallest = age2;
	    System.out.println("Akbar is smallest among three of them.");
	 }else{
	  smallest = age3;
	  System.out.println("Anthony is smallest among three of them.");
	 }
	 double largest = 0;
	 if(height1>height2 && height1>height3){
	    largest = height1;
	    System.out.println("Amar is largest among three of them.");
	 }else if(height2>height1 && height2>height3){
	    largest = height2;
	    System.out.println("Akbar is largest among three of them.");
	 }else{
	    largest = height3;
	    System.out.println("Anthony is largest among three of them.");
	 }
	}
}
	 