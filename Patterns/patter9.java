/*
 
Sample Input 1:
3
Sample Output 1:
  *
 ***
*****
*****
 ***
  *    

 */

import java.util.Scanner;

public class patter9 {
    public static void pattern(int n) {
        // Write your code here
        for (int i = 1; i <= n; i++) {
            // spaces
            int spaces = n - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // stars
            int stars = 2 * (i - 1) + 1;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            // spaces
            int spaces = i;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            // stars
            int stars = 2 * (n - i) - 1;
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            // spaces
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
        sc.close();
    }
}
