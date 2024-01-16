import java.util.Scanner;

public class StudentGrading {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter the number of courses: ");
        int numCourses = inputScanner.nextInt();

        int totalPoints = 0;
        for (int i = 1; i <= numCourses; i++) {
            System.out.print("Enter points obtained in Course " + i + ": ");
            int points = inputScanner.nextInt();
            totalPoints += points;
        }

        double averagePercentage = (double) totalPoints / numCourses;

        System.out.println("\nTotal Points Obtained: " + totalPoints);
        System.out.printf("Average Percentage: %.2f%%%n", averagePercentage);

        String finalGrade = computeFinalGrade(averagePercentage);
        System.out.println("Final Grade: " + finalGrade);

        inputScanner.close();
    }

    public static String computeFinalGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return "Outstanding";
        } else if (averagePercentage >= 80) {
            return "Excellent";
        } else if (averagePercentage >= 70) {
            return "Good";
        } else if (averagePercentage >= 60) {
            return "Satisfactory";
        } else if (averagePercentage >= 50) {
            return "Pass";
        } else {
            return "Fail";
        }
    }
}
