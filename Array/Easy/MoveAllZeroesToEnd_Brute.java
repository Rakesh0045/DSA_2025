public class MoveAllZeroesToEnd_Brute {

    public static void moveZeros(int n, int[] arr) {
        /*
         * 
         * Approach
         * --------
         * 
         * Traverse arr[0,n]. Store arr[i] --> temp[] if arr[i]!=0
         * Traverse temp[0,x]. Move non-zero elements from temp[i] --> arr[i]
         * Traverse arr[x,n]. Fill remaining arr[x,n] --> 0s
         * 
         */

        int[] temp = new int[n];
        int index = 0;

        // STEP-1: Traverse arr[0,n]. Store arr[i] --> temp[] if arr[i]!=0
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[index++] = arr[i];
            }
        }

        // STEP-2: Traverse temp[0,x]. Move non-zero elements from temp[i] --> arr[i]
        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }

        // STEP-3: Traverse arr[x,n]. Fill remaining arr[x,n] --> 0s
        for (int i = temp.length; i < n; i++) {
            arr[i] = 0;
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 2, 0, 0, 4, 5, 1 };
        int n = 10;
        System.out.println("Before moving all zeroes to the end: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        moveZeros(n, arr);

        System.out.println("\nAfter moving all zeroes to the end: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
