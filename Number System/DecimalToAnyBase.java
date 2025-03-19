import java.util.Scanner;

public class DecimalToAnyBase {

    public static void convert(int num, int base) {
        int ans = 0;
        int pow = 1;
        while (num > 0) {
            int rem = num % base;
            num /= base;
            ans += rem * pow;
            pow *= 10;
        }
        System.out.println("Converted number in given base is: " + ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        System.out.println("Enter the base: ");
        int base = sc.nextInt();
        convert(number, base);
    }
}