/*

Sample Input 2 :
5
Sample Output 2 :
*****
*   *
*   *
*   *
*****

 */

import java.util.Scanner;

public class pattern21 {
    public static void pattern(int n) {
        // Write your code here
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
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
