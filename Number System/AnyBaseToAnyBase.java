import java.util.Scanner;

public class AnyBaseToAnyBase {

    public static int DecimalToAnyBase(int num, int base) {
        int ans = 0;
        int pow = 1;
        while (num > 0) {
            int rem = num % base;
            num /= base;
            ans += rem * pow;
            pow *= 10;
        }
        return ans;
    }

    public static int AnyBaseToDecimal(int num, int base) {
        int ans = 0;
        int pow = 1;
        while (num > 0) {
            int rem = num % 10;
            num /= 10;
            ans += rem * pow;
            pow *= base;
        }
        return ans;
    }

    public static void AnyBaseToAnyBase(int num, int base1, int base2) {
        int dec = AnyBaseToDecimal(num, base1);
        int res = DecimalToAnyBase(dec, base2);
        System.out.println("Number converted in given base: " + res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        System.out.println("Enter the base of the number: ");
        int base1 = sc.nextInt();
        System.out.println("Enter the base to which number to be converted: ");
        int base2 = sc.nextInt();
        AnyBaseToAnyBase(number, base1, base2);
    }
}
