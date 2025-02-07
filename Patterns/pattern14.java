/*
 
Sample Input 2 :
4
Sample Output 2 :
A
A B
A B C 
A B C D

 */

import java.util.Scanner;

public class pattern14 {
    public static void pattern(int n) {
        // Write your code here
        for (int i = 1; i <= n; i++) {
            char k = 'A';
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
