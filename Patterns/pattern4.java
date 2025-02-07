/*
 
Input: ‘N’ = 3

Output: 
1
2 2 
3 3 3

 */

import java.util.Scanner;

public class pattern4 {
    public static void pattern(int n) {
        // Write your code here
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
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
