import java.util.Scanner;
public class PossibleHandshakes{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the numberOfStudents:");
	int numberOfStudents = input.nextInt();
	double maximumNumberOfPossibleHandshakes = (numberOfStudents*(numberOfStudents-1))/2;
	System.out.println("Number of students:"+numberOfStudents+" and  maximum number of possible handshakes:"+maximumNumberOfPossibleHandshakes);
	}
	}