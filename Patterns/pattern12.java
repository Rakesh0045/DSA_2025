/*
  
Sample Input 3 :
7
Sample Output 3 :
1                         1
1 2                     2 1
1 2 3                 3 2 1
1 2 3 4             4 3 2 1
1 2 3 4 5         5 4 3 2 1
1 2 3 4 5 6     6 5 4 3 2 1
1 2 3 4 5 6 7 7 6 5 4 3 2 1 
 
 */


import java.util.Scanner;

public class pattern12 {
    public static void pattern(int n) {
        // Write your code here
        int start = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                start = 1;
            else
                start = 0;

            for (int j = 0; j <= i; j++) {
                System.out.print(start);
                start = 1 - start;
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
