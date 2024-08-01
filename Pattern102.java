import java.util.Scanner;

public class Pattern102 {
    public static void main(String[] args) {
        // Creating a Scanner object to read input from STDIN
        Scanner scanner = new Scanner(System.in);

        // Reading an integer input
        int n = scanner.nextInt();

        // Initialize the variable k
        int k = 0;

        // Outer loop for the number of rows
        for (int i = n; i > 0; i--) {
            // Inner loop for printing spaces
            for (int j = 0; j < k; j++) {
                System.out.print(" ");
            }
            // Inner loop for printing '*'
            for (int j = 1; j < 2 * i; j++) {
                System.out.print("*");
            }
            // Incrementing k after each row
            k++;
            // Printing a new line after each row
            System.out.println();
        }

        // Closing the Scanner object
        scanner.close();
    }
}

