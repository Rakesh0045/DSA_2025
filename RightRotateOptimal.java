public class RightRotateOptimal {

    public static void RotatetoRight(int[] arr, int n, int d) {

        /*
         * 
         * Approach
         * --------
         * 
         * reverse last d elements --> arr[n-d,n]
         * reverse remaining first n-d elements --> arr[0,n-d]
         * reverse whole array --> arr[0,n]
         * 
         * 
         * Rotate by -x places == n+(-x) rotate
         * Negative rotation --> Left rotation
         * 
         */

        if (n == 0)
            return;

        d = d % n;

        if (d < 0) {
            d = n + d;
        }

        // STEP-1: reverse last d elements --> arr[n-d,n]
        reverse(arr, n - d, n - 1);

        // STEP-2: reverse remaining first n-d elements --> arr[0,n-d]
        reverse(arr, 0, n - d - 1);

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
        RotatetoRight(arr, n, d);
        System.out.println("After Rotating the elements to right by " + d + " places");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7 };
        d = -2;
        RotatetoRight(arr1, n, d);
        System.out.println("\nAfter Rotating the elements to right by " + d + " places");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
