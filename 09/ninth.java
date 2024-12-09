//     *
//    ***
//   *****
//  *******
// *********
//  *******
//   *****
//    ***
//     *

import java.util.Scanner;

public class ninth{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int totalRowsInPattern = 2 * n - 1; // Total rows in the diamond pattern

        for (int row = 1; row <= totalRowsInPattern; row++) {
            // Determine the current row index for spaces and stars
            int currentRow = row <= n ? row : totalRowsInPattern - row + 1;

            // Calculate spaces and stars for the current row
            int spaces = n - currentRow;
            int stars = 2 * currentRow - 1;

            // Print spaces
            for (int space = 1; space <= spaces; space++) {
                System.out.print(" ");
            }

            // Print stars
            for (int star = 1; star <= stars; star++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}


