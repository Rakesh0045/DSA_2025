/*

Sample Input 1:
3
Sample Output 1:
* * *
* * *
* * *

 */

import java.util.Scanner;

public class pattern1 {

    public static void pattern(int n) {
        // Write your code here
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
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