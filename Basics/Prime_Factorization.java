import java.util.Scanner;

public class Prime_Factorization {

    public static void PrimeFactor(int n) {
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                n /= i;
                System.out.print(i + " ");
            }
        }

        if (n != 1) {
            System.out.print(n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        PrimeFactor(n);
        sc.close();
    }
}
