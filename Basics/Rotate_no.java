import java.util.Scanner;

public class Rotate_no {

    public static int rotate(int n, int r) {
        int digits = (int) (Math.log10(n) + 1);
        r = r % digits;
        if (r < 0) {
            r += digits;
        }
        int div = (int) Math.pow(10, r);
        int mul = (int) Math.pow(10, digits - r);
        int rot = (n / div) + mul * (n % div);
        return rot;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Enter roatate value: ");
        int r = sc.nextInt();
        System.out.println(rotate(n, r));
        sc.close();
    }
}
