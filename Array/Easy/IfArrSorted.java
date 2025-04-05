public class IfArrSorted {

    static boolean isSorted(int[] arr, int n){
        boolean asc = true;
        boolean desc = true;
        for(int i=1;i<n;i++){
            // if(arr[i]>=arr[i-1]) --> Condition for ascending order
            if(arr[i]<arr[i-1]){ // if arr not in asc order
                asc = false; 
            }
        }

        for(int i=1;i<n;i++){
            // if(arr[i]<=arr[i-1]) --> Condition for descending order
            if(arr[i]>arr[i-1]){ // if arr not in desc order
                desc = false; 
            }
        }

        return asc||desc; //if arr is not in either desc or asc --> then arr is not sorted
    }
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5}, n = 5;
        System.out.println(isSorted(arr, n));
        int arr1[] = {5,4,3,2,1}, n1 = 5;
        System.out.println(isSorted(arr1, n1));
      }
    
}
