import java.util.Scanner;

public class Print_Digits {

    public static void printDigits(int n) {
        int digits = (int) Math.log((n) + 1);
        int div = (int) Math.pow(10, digits - 1);
        while (div != 0) {
            int q = n / div;
            System.out.print(q + " ");
            n = n % div;
            div /= 10;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        printDigits(n);
        sc.close();
    }
}
