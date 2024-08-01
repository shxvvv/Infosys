import java.util.Scanner;

public class Pattern112 {
    public static void main(String[] args) {
        // Creating a Scanner object to read input from STDIN
        Scanner scanner = new Scanner(System.in);

        // Reading a long integer input
        long n = scanner.nextLong();

        // Outer loop for the number of rows
        for (long i = 1; i <= n; i++) {
            // Determine the value of k based on the parity of i
            long k = (i % 2 == 1) ? n : 1;

            // Inner loop for the number of columns
            for (long j = 1; j <= n; j++) {
                // Print i+1 if the condition is met, otherwise print i
                if (j == k) {
                    System.out.print((i + 1) + " ");
                } else {
                    System.out.print(i + " ");
                }
            }
            // Print a new line after each row
            System.out.println();
        }

        // Closing the Scanner object
        scanner.close();
    }
}
