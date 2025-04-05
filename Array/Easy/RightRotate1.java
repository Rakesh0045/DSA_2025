public class RightRotate1 {
    static void solve(int arr[], int n) {

        /*
        
            Approach
            --------

            * Store last element arr[n-1] --> temp
            * Right shift all remaining elments arr[0,n-1] by 1 place  
            * Assign arr[n-1] in temp to the first position arr[0]

            * While Right Shift arr[0,n-1] --> Its better to do from backwards i.e from arr[n-1] --> arr[0] otherwise elements get overridden

         */


        int temp = arr[n-1]; 
        for (int i = n-2; i >= 0; i--) {
          arr[i+1] = arr[i]; 
        }
        arr[0] = temp; 
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
