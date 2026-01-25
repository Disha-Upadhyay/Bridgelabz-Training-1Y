import java.util.Scanner;
public class SpringSeason{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a month:");
System.out.println("Enter a day:");
int month = sc.nextInt();
int day = sc.nextInt();
if((month==3 && day>=20)||(month==4)||(month==5)||(month==6 && day<=20)){
System.out.println("It's a spring season");
}
else{
System.out.println("Not a spring season");
}
}
}

