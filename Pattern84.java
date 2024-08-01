import java.util.Scanner;

public class Pattern84 {
    public static void main(String[] args) {
        // Creating a Scanner object to read input from STDIN
        Scanner scanner = new Scanner(System.in);

        // Reading an integer input
        int n = scanner.nextInt();

        // Outer loop for the number of rows
        for (int i = 1; i <= n; i++) {
            // Inner loop for printing numbers in ascending order
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Printing a new line after each row
            System.out.println();
        }

        // Closing the Scanner object
        scanner.close();
    }
}

