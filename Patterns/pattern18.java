/*
 
Sample Input 1:
3
Sample Output 1:
C
C B 
C B A

 */

import java.util.Scanner;

public class pattern18 {
    public static void pattern(int n) {
        // Write your code here
        for(int i=1;i<=n;i++){
            char ch=(char)(64+n);
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch--;
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
