/*
 
Sample Input 2 :
5
Sample Output 2 :
555555555
544444445
543333345
543222325
543212345
543222325
543333345
544444445
555555555


Sample Input 3 :
4
Sample Output 3 :
4444444
4333334
4322234
4321234
4322234
4333334
4444444


 */

import java.util.Scanner;

public class pattern22 {
    public static void pattern(int n) {
        // Write your code here
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int top = i;
                int left = j;
                int right = 2 * n - 2 - j;
                int bottom = 2 * n - 2 - i;
                System.out.print(n - Math.min(Math.min(top, left), Math.min(right, bottom)));
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
