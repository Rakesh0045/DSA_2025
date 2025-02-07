/*

Sample Input 1:
3
Sample Output 1:
1 2 3
1 2
1

 */

import java.util.Scanner;

public class pattern6 {
    public static void pattern(int n) {
        // Write your code here
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
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
