import java.util.Scanner;

public class AnyBaseMultiplication {

    public static int AnyBaseAdd(int num1, int num2, int base) {
        int ans = 0;
        int carry = 0;
        int power = 1;
        while (num1 > 0 || num2 > 0 || carry > 0) {
            int d1 = num1 % 10;
            int d2 = num2 % 10;
            num1 /= 10;
            num2 /= 10;
            int value = d1 + d2 + carry;
            carry = value / base;
            value = value % base;
            ans += value * power;
            power *= 10;
        }
        return ans;
    }

    public static void AnyBaseMul(int num1, int num2, int base) {
        int ans = 0;
        int power = 1;
        while (num2 > 0) {
            int d = num2 % 10;
            num2 /= 10;
            int singleProd = getSingleProduct(base, num1, d);
            ans = AnyBaseAdd(ans,singleProd*power,base);
            power *= 10;
        }
        System.out.println("Sum is: " + ans);
    }

    public static int getSingleProduct(int base, int num1, int d) {
        int ans = 0;
        int carry = 0;
        int pow = 1;
        while (num1 > 0 || carry > 0) {
            int d1 = num1 % 10;
            num1 /= 10;
            int value = d1 * d + carry;
            carry = value / base;
            value = value % base;
            ans += value * pow;
            pow *= 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int num1 = sc.nextInt();
        System.out.print("\nEnter the number 2: ");
        int num2 = sc.nextInt();
        System.out.println("\nEnter the base of the numbers: ");
        int base = sc.nextInt();
        AnyBaseMul(num1, num2, base);
    }
}
