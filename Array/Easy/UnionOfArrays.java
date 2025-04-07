import java.util.ArrayList;

public class UnionOfArrays {

    static ArrayList<Integer> FindUnion(int arr1[], int arr2[], int n, int m) {
        /*
         * 
         * 
         * 2 pointer Approach
         * ------------------
         * 
          Works only if both arrays are sorted
         
         * Take two pointers let’s say i,j = 0 pointing to the 0th index of arr1 and arr2.
         * Create an empty array/list for storing the union of arr1 and arr2.
         * Traverse both arrs till i<arr1.length and j<arr2.length
         * if arr1[ i ] <= arr2[ j ] && last element in union[] != arr1[i]--> insert arr1[i] to union[] --> i++
         * if arr1[i]>arr2[j] && last element in union[] != arr2[j] --> insert arr2[j] to union --> j++
         * After traversing if any elements are left in arr1 or arr2 check for condition and insert in the union.
         
          after checking every element, i and j pointers will be incremented to check for next element
         * 
         */

        int i = 0, j = 0;
        ArrayList<Integer> Union = new ArrayList<>();

        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr1[i]) {
                    Union.add(arr1[i]);
                }
                i++; // increment i to check next element
            } else {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr2[j]) {
                    Union.add(arr2[j]);
                }
                j++; // increment j to check next element even if element is present in union
            }
        }

        while (i < n) // IF any element left in arr1
        {
            if (Union.get(Union.size() - 1) != arr1[i])
                Union.add(arr1[i]);
            i++;
        }

        while (j < m) // If any elements left in arr2
        {
            if (Union.get(Union.size() - 1) != arr2[j])
                Union.add(arr2[j]);
            j++;
        }
        return Union;
    }

    public static void main(String args[]) {
        int n = 10, m = 7;
        int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int arr2[] = { 2, 3, 4, 4, 5, 11, 12 };
        ArrayList<Integer> Union = FindUnion(arr1, arr2, n, m);
        System.out.println("Union of arr1 and arr2 is ");
        for (int val : Union)
            System.out.print(val + " ");
    }
}
