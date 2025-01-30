import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is even or odd using the conditional operator
        String result = (number % 2 == 0) ? "even" : "odd";

        System.out.println("The number " + number + " is " + result + ".");

        scanner.close();
    }
}
