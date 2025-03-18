import java.util.Scanner;

public class printNto1_BackTrack {
    public static void f(int i, int n) {
        if (i > n) {
            return;
        }
        f(i + 1, n);
        System.out.print(i + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Printing " + n + " to 1 using backward recursion: ");
        f(1, n);
        sc.close();
    }
}
