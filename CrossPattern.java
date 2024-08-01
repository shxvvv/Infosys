import java.util.Scanner;

public class CrossPattern {
    public static void main(String[] args) {
        // Creating a Scanner object to read input from STDIN
        Scanner scanner = new Scanner(System.in);

        // Reading a long integer input
        long n = scanner.nextLong();

        // Creating an array to store the input values
        int[] array = new int[(int) n];

        // Reading the input values into the array
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Initializing the variable i
        long i = 0;

        // Outer loop to iterate through the array
        while (i < array.length) {
            // Inner loop to print the pattern
            for (long j = 0; j < n; j++) {
                if (j == i || j == n - i - 1) {
                    System.out.print(i + 1);
                } else {
                    System.out.print(" ");
                }
            }
            // Printing a new line after each row
            System.out.println();
            i++;
        }

        // Closing the Scanner object
        scanner.close();
    }
}

 