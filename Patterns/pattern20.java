/*
 
Sample Input 1:
3
Sample Output 1:
*         *
* *     * *
* * * * * *
* *     * *
*         *

 */

import java.util.Scanner;

public class pattern20 {
    public static void pattern(int n) {
        // Write your code here

        int breakpoint = n;
        for (int i = 1; i <= 2 * n - 1; i++) {
            // stars
            int stars = i;
            if (i > breakpoint)
                stars = 2 * n - i;

            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }

            // spaces

            int space = n - 2 * stars;

            for (int j = 0; j < space; j++) {
                System.out.print("  ");
            }

            // stars
            for (int j = 0; j < stars; j++) {
                System.out.print("* ");
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
