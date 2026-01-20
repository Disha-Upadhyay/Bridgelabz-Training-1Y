import java.util.Scanner;
public class MaxHandshakes{
    public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter no. of students:");
	int numberOfStudents = scanner.nextInt();
	double MaxHandshakes = (numberOfStudents*(numberOfStudents-1))/2; ;
	System.out.println("Max possible handshakes :"+MaxHandshakes)
	