import java.util.ArrayList;
import java.util.Scanner;

public class MergeSort {

    private static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>(high-low+1);
        int left = low;
        int right = mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<arr[right]){
                temp.add(arr[left++]);
            }else{
                temp.add(arr[right++]);
            }
        }

        //If elements remain on right arr
        while(left<=mid){
            temp.add(arr[left++]);
        }

        //If elements remain on left arr
        while(right<=high){
            temp.add(arr[right++]);
        }

        //Replacing arr with sorted array temp
        for(int i=low;i<=high;i++){
            arr[i] = temp.get(i-low);
        }
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if(low>=high){
            return;
        }
        int mid = (low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
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
        mergeSort(arr, 0, n - 1);
        System.out.println("After sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
