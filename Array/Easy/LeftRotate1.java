public class LeftRotate1 {

    static void solve(int arr[], int n) {

        /*
        
            Approach
            --------

            * Store first element arr[0] --> temp
            * Left shift all remaining elments arr[1,n] by 1 place  --> arr[i-1] = arr[i]
            * Assign arr[0] in temp to the last position arr[n-1]

         */


        int temp = arr[0]; // storing the first element of array in a variable
        for (int i = 1; i < n; i++) {
          arr[i-1] = arr[i];
        }
        arr[n - 1] = temp; // assigned the value of variable at the last index
        for (int i = 0; i < n; i++) {
          System.out.print(arr[i]+" ");
        }
      
        
      }
    public static void main(String args[]) {
        int n=5;
        
        int arr[]= {1,2,3,4,5};
        solve(arr, n);
      }
}
