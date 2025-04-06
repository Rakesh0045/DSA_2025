public class MoveAllZeroesToEnd_Optimal {

    public static void moveZeros(int n, int[] arr) {
        /*
         * 
         * 2 Pointer Approach
         * ------------------
         * 
         * Find index j of first zero in arr
         * 1st pointer j --> index of first zero
         * 2nd pointer --> i = j+1
         * Traverse arr[j,n] If we find any non-zero element i.e arr[i]!=0 --> Bring
         * non-zero element(arr[i]) to 0's place(arr[j]) --> swap(arr[i],arr[j]) -->
         * Then move the counter j++ to check for more non-zero elements
         * 
         */

        // STEP-1: Find index of first zero in arr
        int j = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        // If j==-1 then arr doesn't contain any 0s
        if (j == -1) {
            return;
        }

        // STEP-2: Traverse arr[j,n] If we find any non-zero element i.e arr[i]!=0 -->
        // Bring non zero element(arr[i]) to 0's place(arr[j]) --> swap(arr[i],arr[j])

        for (int i = j + 1; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
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
