/*
 
Sample Input 1:
3
Sample Output 1:
* * * * * * 
* *     * * 
*         * 
*         * 
* *     * * 
* * * * * * 

 */

import java.util.Scanner;

public class pattern19 {
    public static void pattern(int n) {
        // Write your code here

        // upper pattern
        int space = 0;
        for (int i = 0; i < n; i++) {
            // stars
            int stars = n - i;
            for (int j = 0; j < stars; j++) {
                System.out.print("* ");
            }

            // spaces
            for (int j = 0; j < space; j++) {
                System.out.print("  ");
            }

            // stars
            for (int j = 0; j < stars; j++) {
                System.out.print("* ");
            }

            System.out.println();
            space += 2;
        }

        // lower pattern
        space = (2 * n) - 2;
        for (int i = 1; i <= n; i++) {
            // stars
            int stars = i;
            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }

            // spaces
            for (int j = 0; j < space; j++) {
                System.out.print("  ");
            }

            // stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }

            System.out.println();
            space -= 2;
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
