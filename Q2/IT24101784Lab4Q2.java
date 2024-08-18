import java.util.Scanner;

public class IT24101784Lab4Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input exam marks
        System.out.print("Please enter exam marks (out of 100): ");
        int examMarks = scanner.nextInt();

        // Validate exam marks
        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid input for exam marks. Terminating program.");
            return;
        }

        // Input lab submission marks
        System.out.print("Please enter lab submission marks (out of 100): ");
        int labMarks = scanner.nextInt();

        // Validate lab submission marks
        if (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid input for lab submission marks. Terminating program.");
            return;
        }

        // Input percentage for exam
        System.out.print("Please enter the percentage given for the exam: ");
        int examPercentage = scanner.nextInt();

        // Input percentage for lab submission
        System.out.print("Please enter the percentage given for the lab submission: ");
        int labPercentage = scanner.nextInt();

        // Validate percentages
        if (examPercentage + labPercentage != 100) {
            System.out.println("The percentages must add up to 100. Terminating program.");
            return;
        }

        // Calculate final exam marks
        double finalMark = (examMarks * (examPercentage / 100.0)) + (labMarks * (labPercentage / 100.0));
        System.out.println("Final Exam Mark is: " + finalMark);
    }
}