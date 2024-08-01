import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Reading an integer input
        int n = scanner.nextInt();

        // Outer loop for the number of rows
        for (int i = n; i > 0; i--) {
            // Inner loop for printing '#' in each row
            for (int j = i; j > 0; j--) {
                System.out.print("# ");
            }
            // Printing a new line after each row
            System.out.println();
        }

        // Closing the Scanner object
        scanner.close();
    }
}
