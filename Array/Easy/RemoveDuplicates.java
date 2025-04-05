import java.util.Arrays;

public class RemoveDuplicates {
    static int removeDuplicates(int[] arr){

        /*
        
            Two Pointer Approach
            --------------------

            * Take arr[0] as 1st pointer i
            * Take arr[1] as 2nd pointer j
            * if(arr[i]!=arr[j]) --> i++, arr[i] = arr[j]
            * j++ until j<n

         */

        int i=0;
        int j = i+1;
        while(j<arr.length){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
            j++;
        }

        System.out.println("The array after removing duplicate elements is ");
        int unique = i+1;
        int[] array = Arrays.copyOf(arr, unique);
        System.out.println(Arrays.toString(array));

        return i+1;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3};
        removeDuplicates(arr);
        //  System.out.println("The array after removing duplicate elements is ");
        //  for (int i = 0; i < k; i++) {
        //      System.out.print(arr[i] + " ");
        //  }
     }
}
