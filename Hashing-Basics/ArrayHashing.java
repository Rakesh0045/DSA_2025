import java.util.*;

class ArrayHashing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter Array Size: ");
        n = sc.nextInt();
        System.out.println("Enter Array Elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //precompute:
        int[] hash = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }

        int q;
        System.out.print("Enter Total Test Cases: ");
        q = sc.nextInt();
        while (q-- != 0) {
            int number;
            System.out.print("Enter Element: ");
            number = sc.nextInt();
            // fetching:

            System.out.println(number+ "'s frequency is: "+hash[number]);
        }
    }
}