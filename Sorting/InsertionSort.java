public class InsertionSort {

    public static void Insertion_sort(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        System.out.println("After Insertion sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String args[]) {

        int arr[] = { 13, 46, 24, 52, 20, 9 };
        int n = arr.length;
        System.out.println("Before Insertion sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Insertion_sort(arr, n);
    }
}
