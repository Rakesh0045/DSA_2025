public class RightRotateDplaces {
    public static void RotatetoRight(int[] arr, int n, int d) {

        /*
        
            Approach
            --------

            * copy last d elements into temp[]. arr[n-d,d] --> temp[0,d]
            * Right shift all remaining elments arr[0,n-d] by 1 place  
            * copy elements from temp array to first d places. temp[0,d] --> arr[0,d]

            n+1 rotate == 1 rotate 
            n+2 rotate == 2 rotate

            d rotate = d%n rotate

            Rotate by -x places == n+(-x) rotate
            Negative rotation --> Left rotation

            IMP: While Right Shift arr[0,n-d] --> Its better to do from backwards i.e from arr[n-d] --> arr[0] otherwise elements get overridden

         */


        if (n == 0)
            return;
        
        d = d % n;

        if(d<0){
            d = n+d;
        }

        //STEP-1: copy last d elements into temp[]. arr[n-d,d] --> temp[0,d]
        int[] temp = new int[d];
        for(int i=n-d;i<n;i++){
            temp[i-(n-d)] = arr[i];
        }

        //STEP-2: Right shift all remaining elments arr[0,n-d] by 1 place  
        for(int i=n-d-1;i>=0;i--){
            arr[i+d] = arr[i]; //Right shift d places
        }

        //STEP-3: copy elements from temp array to first d places. temp[0,d] --> arr[0,d]
        for(int i=0;i<d;i++){
            arr[i] = temp[i];
        }

      }
    public static void main(String args[]) {
        int n = 7;
        int[] arr = {1,2,3,4,5,6,7};

        int d = 2;
        RotatetoRight(arr, n, d);
        System.out.println("After Rotating the elements to right by "+d+" places");
        for (int i = 0; i < n; i++) {
          System.out.print(arr[i] + " ");
        }

        int[] arr1 = {1,2,3,4,5,6,7};
        d = -2;
        RotatetoRight(arr1, n, d);
        System.out.println("\nAfter Rotating the elements to right by "+d+" places");
        for (int i = 0; i < n; i++) {
          System.out.print(arr1[i] + " ");
        }
      }
}
