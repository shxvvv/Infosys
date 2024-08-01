import java.util.Scanner;

public class PrintPattern {
    public static void main(String[] args) {
        // Creating a Scanner object to read input from STDIN
        Scanner scanner = new Scanner(System.in);

        // Reading a line of input as a string
        String s = scanner.nextLine();

        // Outer loop to iterate through the characters of the string
        for (int i = 0; i < s.length(); i++) {
            // Inner loop to print the substring from the start up to the current character
            for (int j = 0; j <= i; j++) {
                System.out.print(s.charAt(j));
            }
            // Printing a new line after each substring
            System.out.println();
        }

        // Closing the Scanner object
        scanner.close();
    }
}