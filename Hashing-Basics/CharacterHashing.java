import java.util.*;

class CharacterHashing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s;
        s = sc.next();
        s = s.replace(" ","");

        // precompute:
        int[] hash = new int[256];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)]++;
        }

        int q;
        System.out.print("Enter Total Test Cases: ");
        q = sc.nextInt();
        while (q-- > 0) {
            char c;
            System.out.print("Enter the character: ");
            c = sc.next().charAt(0);
            // fetch:
            System.out.println("Frequency of " + c + ": " + hash[c]);
        }
    }
}