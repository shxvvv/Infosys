import java.util.Scanner;

public class Pattern76 {
    public static void main(String[] args) {
        // Creating a Scanner object to read input from STDIN
        Scanner scanner = new Scanner(System.in);

        // Reading an integer input
        int n = scanner.nextInt();

        // Initializing the variable k
        int k = 1;

        // Outer loop for the number of rows
        for (int i = 1; i <= n; i++) {
            // Inner loop for the number of columns
            for (int j = 1; j <= n; j++) {
                // Printing the current value of k followed by a space
                System.out.print(k + " ");
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
