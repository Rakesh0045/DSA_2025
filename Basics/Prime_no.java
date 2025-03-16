import java.util.Scanner;

public class Prime_no {

    public static boolean isPrime(int n) {
        int cnt = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {

            // If n is divisible by i
            // without any remainder.
            if (n % i == 0) {

                // Increment the counter.
                cnt = cnt + 1;

                // If n is not a perfect square,
                // count its reciprocal factor.
                if (n / i != i) {
                    cnt = cnt + 1;
                }
            }
        }

        // If the number of
        // factors is exactly 2.
        if (cnt == 2) {
            // Return true, indicating
            // that the number is prime.
            return true;
        }
        // If the number of
        // factors is not 2.
        else {
            // Return false, indicating
            // that the number is not prime.
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(isPrime(n));
        sc.close();
    }
}
