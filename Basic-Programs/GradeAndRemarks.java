import java.util.Scanner;
public class GradeAndRemarks{
     public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a physics marks:");
	 System.out.println("Enter a chemistry marks:");
	 System.out.println("Enter a maths marks:");
	 double physics = sc.nextDouble();
	 double chemistry = sc.nextDouble();
	 double maths = sc.nextDouble();
	  double sum = physics+chemistry+maths;
	  double average = sum/3.0;
	  double percentage = (sum/300)*100;
	  if(percentage>=80){
	     System.out.println("Grade = A");
		 System.out.println("Remark = level 4, above agency-normalized standards");
		 System.out.println("Average marks = " + average);
	  }else if(percentage>=70 && percentage<=79){
	     System.out.println("Grade = B");
		 System.out.println("Remark = level 3, at agency-normalized standards");
		 System.out.println("Average marks = " + average);
	  }else if(percentage>=60 && percentage<=69){
	     System.out.println("Grade = C");
		 System.out.println("Remark = level 2, below,but approaching agency-normalized standards");
		 System.out.println("Average marks = " + average); 
	  }else if(percentage>=50 && percentage<=59){
	     System.out.println("Grade = D");
		 System.out.println("Remark = level 1, well below agency-normalized standards");
		 System.out.println("Average marks = " + average);
	  }else if(percentage>=40 && percentage<=49){
	     System.out.println("Grade = E");
		 System.out.println("Remark = level 1-, too below agency-normalized standards");
		 System.out.println("Average marks = " + average);
	  }else {
	     System.out.println("Grade = R");
		 System.out.println("Remark =  Remedial standards");
		 System.out.println("Average marks = " + average);
	  }
	  }
	 }
	  
	 