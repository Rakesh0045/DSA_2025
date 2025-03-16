/*

Input: n = 12
Output: 2

*/

import java.util.Scanner;

class Count_Digits {
    static int evenlyDivides(int n) {
        // code here
        int num = n;
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem != 0 && num % rem == 0) {
                count++;
            }
            n /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int res = evenlyDivides(n);
        System.out.println("No. of digits: " + res);
        sc.close();
    }
}