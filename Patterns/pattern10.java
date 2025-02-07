/*
 
Sample Input 1:
3
Sample Output 1:
*
**
***
**
*

 */

import java.util.Scanner;

public class pattern10 {
    public static void pattern(int n) {
        // Write your code here
        for (int i = 1; i <= n; i++) {

            // number
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // space
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // number
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
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
