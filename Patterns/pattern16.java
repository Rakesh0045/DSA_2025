/*

Sample Input 3 :
4
Sample Output 3 :
A
B B
C C C
D D D D

 */

import java.util.Scanner;

public class pattern16 {
    public static void pattern(int n) {
        // Write your code here
        char k = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
            }
            System.out.println();
            k++;
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
