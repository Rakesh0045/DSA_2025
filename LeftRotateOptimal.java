public class LeftRotateOptimal {
    public static void Rotatetoleft(int[] arr, int n, int d) {

        /*
         * 
         * Approach
         * --------
         * 
         * reverse first d elements --> arr[0,d]
         * reverse remaining last n-d elements --> arr[d,n]
         * reverse whole array --> arr[0,n]
         * 
         * 
         * Rotate by -x places == n+(-x) rotate
         * Negative rotation --> Right rotation
         * 
         */

        if (n == 0)
            return;

        d = d % n;

        if (d < 0) {
            d = n + d;
        }

        // STEP-1: reverse first d elements --> arr[0,d]
        reverse(arr, 0, d - 1);

        // STEP-2: reverse remaining last n-d elements --> arr[d,n]
        reverse(arr, d, n - 1);

        // STEP-3: reverse whole array --> arr[0,n]
        reverse(arr, 0, n - 1);

    }

    public static void reverse(int[] arr, int i, int j) {
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String args[]) {
        int n = 7;
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

        int d = 2;
        Rotatetoleft(arr, n, d);
        System.out.println("After Rotating the elements to left by " + d + " places");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7 };
        d = -2;
        Rotatetoleft(arr1, n, d);
        System.out.println("\nAfter Rotating the elements to left by " + d + " places");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
