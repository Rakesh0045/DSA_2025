/*

Sample Input 2 :
4
Sample Output 2 :
1
2 3
4 5 6 
7 8 9 10

 */

import java.util.Scanner;

public class pattern13 {
    public static void pattern(int n) {
        // Write your code here
        int k = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k++;
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
