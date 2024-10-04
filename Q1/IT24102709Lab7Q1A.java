import java.util.Scanner;
	public class IT24102709Lab7Q1A {
		public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int subject1,subject2,subject3,subject4;
		double average;
		
		System.out.print("Enter marks for subject 1: ");
		subject1 = scanner.nextint();
		
		System.out.print("Enter marks for subject 2: ");
		subject2 = scanner.nextint();
		
		System.out.print("Enter marks for subject3: ");
		subject3 = scanner.nextint();
		
		System.out.print("Enter marks for subject4: ");
		subject4 = scanner.nextint();
		
		average = (subject1+subject2+subject3+subject4)/4.0;
		
		String grade;
		if (average >=75 && average <= 100) {
			grade = "Distinction";
		} else if (average>=50 && average < 75){
			grade = "Credit";
		} else if (averge >=0 && average < 50) {
			grade = "Fail";
		} else {
			grade = "invalid marks entered";
		}
		
		System.out.println("Average is :"+average);
		System.out.println("Overall Grade is :"+Credit);
	}
}
		
		