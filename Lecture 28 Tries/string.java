import java.util.Scanner;

public class string{
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a string: ");

        // Read the input string
        String input = scanner.nextLine();

        // Display the input back to the user
        System.out.println("You entered: " + input);

        // Close the scanner
        scanner.close();
    }
}
