import java.util.Scanner;

public class String_Pallindrome {
    public static void isPallindrome(String n, int i) {
        if (i >= n.length() / 2) {
            System.out.println(n + " is a pallindrome string");
            return;
        }

        if (n.charAt(i) != n.charAt(n.length() - i - 1)) {
            System.out.println(n + " is not a pallindrome string");
            return;
        }

        isPallindrome(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String n = sc.nextLine();
        isPallindrome(n, 0);
    }
}
