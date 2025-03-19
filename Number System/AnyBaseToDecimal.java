import java.util.Scanner;

public class AnyBaseToDecimal {

    public static void convert(int num, int base) {
        int ans = 0;
        int pow = 1;
        while (num > 0) {
            int rem = num % 10;
            num /= 10;
            ans += rem * pow;
            pow *= base;
        }
        System.out.println("Given number in decimal is: " + ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        System.out.println("Enter the base of the number: ");
        int base = sc.nextInt();
        convert(number, base);
    }
}
