import java.util.Scanner;
public class DivisibleBy5{
    public static void main(String[] args){
	Scanner sc =  new Scanner(System.in);
	System.out.println("Enter a number:");
	int Num = sc.nextInt();
	if(Num%5==0){
	System.out.println("Is the number"+Num+" divisible by 5? yes");
	}
	else{
	System.out.println("Is the number"+Num+ " divisible by 5? no");
	}
	}
}