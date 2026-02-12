package Programs;

import java.util.Scanner;

public class Letter_Grades_APP {
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("Enter test score: ");
		Double score = userinput.nextDouble();
		
		String grade;
		
		if (score > 100 || score < 0) {
            grade = "Invalid score, try again";
        }
        else if (score >= 93) {
            grade = "A";
        }
        else if (score >= 90) {
            grade = "A-";
        }
        else if (score >= 87) {
            grade = "B+";
        }
        else if (score >= 83) {
            grade = "B";
        }
        else if (score >= 80) {
            grade = "B-";
        }
        else if (score >= 77) {
            grade = "C+";
        }
        else if (score >= 73) {
            grade = "C";
        }
        else if (score >= 70) {
            grade = "C-";
        }
        else if (score >= 67) {
            grade = "D+";
        }
        else if (score >= 63) {
            grade = "D";
        }
        else if (score >= 60) {
            grade = "D-";
        }
        else {
            grade = "F";
        }
		
		System.out.println("Test Grade: " + grade);
		
	}
}
