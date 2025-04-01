import java.util.Scanner;

public class QuickSort {

    static int partition(int[] arr, int low, int high){
        int i = low;
        int j = high;
        int pivot = arr[i];

        while(i<j){
            
            while(arr[i]<=pivot && i<high){
                i++;
            }

            while(arr[j]>pivot && j>low){
                j--;
            }

            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        //swap pivot to its correct position
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }

    static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int index = partition(arr,low,high);
            quickSort(arr,low,index-1);
            quickSort(arr, index+1, high);
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 7;
        int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
        System.out.println("Before sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        quickSort(arr, 0, n-1);
        System.out.println("After sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
