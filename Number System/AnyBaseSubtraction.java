import java.util.Scanner;

public class AnyBaseSubtraction {

    public static void AnyBaseSub(int num1, int num2, int base) {
        int ans = 0;
        int carry = 0;
        int power = 1;
        while (num1 > 0) {
            int d1 = num1 % 10;
            int d2 = num2 % 10;
            num1 /= 10;
            num2 /= 10;
            d1 += carry;
            int value = 0;
            if (d1 >= d2) {
                carry = 0;
                value = d1 - d2;
            } else {
                carry = -1;
                value = d1 + base - d2;
            }
            ans += value * power;
            power *= 10;
        }
        System.out.println("Sum is: " + ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int num1 = sc.nextInt();
        System.out.print("\nEnter the number 2: ");
        int num2 = sc.nextInt();
        System.out.println("\nEnter the base of the numbers: ");
        int base = sc.nextInt();
        AnyBaseSub(num1, num2, base);
    }
}
