import java.util.Scanner;

public class IT24101784Lab4Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Use ternary operator to determine if the number is positive, negative, or zero
        String result = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";

        // Output the result
        System.out.println("The number is: " + result);
    }
}