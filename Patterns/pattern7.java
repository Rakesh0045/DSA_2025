/*
 
Sample Input 1:
3
Sample Output 1:
  *
 ***
*****
Explanation Of Sample Input 1 :
The first row contains two spaces, followed by a star.
The second row contains one space, followed by three stars.
The third row contains five stars.

 */

import java.util.Scanner;

public class pattern7 {
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
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
        sc.close();
    }
}
