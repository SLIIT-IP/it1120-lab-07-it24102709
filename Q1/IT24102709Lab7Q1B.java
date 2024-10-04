impimport java.util.Scanner;
	public class IT24102709LAb7Q1B {
		public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 1;i<= 3;i++) {
		  Scanner.out.println("Enter marks :"+ i + ":");
		  
		int subject1 = scanner.nextInt();
		int subject2 = scanner.nextInt();
		int subject3 = scanner.nextInt();
	    int subject4 = scanner.nextInt();
		  
		double average = (subject1 + subject2 + subject3 + subject4) / 4.0
		  
		String grade;
		if (average >= 75 && average <= 100) {
		grade = "Distinction";
		} else if (average >= 50 && average < 75) {
		grade = "Credit";
		} else if (average >= 0 && average < 50) {
		grade = "Fail";
		} else {
			grade = "Invalid marks enterd.";
			
		System.out.println("Student" + i + "- Average MArksL:" + average);
		System.out.println("Student" + i + "- Grade:" + grade);
		System.out.println();
		}
	}