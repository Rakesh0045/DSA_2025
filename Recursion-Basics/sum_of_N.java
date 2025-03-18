import java.util.Scanner;

public class sum_of_N {
    public static void f(int n, int sum) {
        if (n < 1) {
            System.out.print(sum);
            return;
        }
        f(n - 1, sum + n);
    }

    public static int f1(int n) {
        if (n == 0) {
            return 0;
        }
        return n + f1(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("Sum of 1 to " + n + " using parameterized recursion: ");
        f(n, 0);
        System.out.print("\nSum of 1 to " + n + " using functional recursion: " + f1(n));
        sc.close();
    }
}
