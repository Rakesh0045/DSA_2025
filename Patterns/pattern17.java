/*
 
Sample Input 1:
3
Sample Output 1:
    A
  A B A
A B C B A

 */

import java.util.Scanner;

public class pattern17 {
    public static void pattern(int n) {
        // Write your code here
        for (int i = 1; i <= n; i++) {

            // spaces
            int spaces = n - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // alphabets
            char k = 'A';
            int breakpoint = (2 * i) / 2;
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(k + " ");
                if (j < breakpoint) {
                    k++;
                } else {
                    k--;
                }

            }

            // spaces
            for (int j = 1; j <= spaces; j++) {
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
