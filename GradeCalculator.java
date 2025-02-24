import java.util.Scanner;

public class GradeCalculator {

    // Method to get the student's score from the user
    public static double getStudentScore() {
        Scanner scanner = new Scanner(System.in);
        double score = -1;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter the student's score: ");
                score = Double.parseDouble(scanner.nextLine());
                if (score < 0 || score > 100) {
                    System.out.println("Please enter a valid score between 0 and 100.");
                } else {
                    validInput = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric value.");
            }
        }
        return score;
    }

    // Method to determine the letter grade
    public static String calculateGrade(double score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        double score = getStudentScore(); // Get user input
        String grade = calculateGrade(score); // Calculate grade
        System.out.println("The student's grade is: " + grade); // Display result
    }
}
