import java.util.Scanner;

public class Pattern123 {
    public static void main(String[] args) {
        // Creating a Scanner object to read input from STDIN
        Scanner scanner = new Scanner(System.in);

        // Reading an integer input
        int n = scanner.nextInt();

        // Outer loop for the number of rows
        for (int i = 1; i <= n; i++) {
            // Inner loop for printing numbers in descending order
            for (int j = n; j > 0; j--) {
                System.out.print(j + " ");
            }
            // Printing a new line after each row
            System.out.println();
        }

        // Closing the Scanner object
        scanner.close();
    }
}

