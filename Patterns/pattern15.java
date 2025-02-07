/*
 
Sample Input 2 :
4
Sample Output 2 :
A B C D
A B C
A B
A

 */

import java.util.Scanner;

public class pattern15 {
    public static void pattern(int n) {
        // Write your code here
        for (int i = n; i >= 1; i--) {
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
