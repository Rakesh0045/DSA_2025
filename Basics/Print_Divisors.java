import java.util.Scanner;

public class Print_Divisors {

    public static void getDivisors(int num) {
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                if (i != num / i) {
                    System.out.print(num / i + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        getDivisors(n);
        sc.close();
    }

}
