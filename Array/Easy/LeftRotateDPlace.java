public class LeftRotateDPlace {

    public static void Rotatetoleft(int[] arr, int n, int d) {

        /*
        
            Approach
            --------

            * copy first d elements into temp[]. arr[0,d] --> temp[0,d]
            * Left shift all remaining elments arr[d,n] by 1 place  --> arr[i-d] = arr[i]
            * copy elements from temp array to last d places. temp[0,d] --> arr[n-d,n]

            n+1 rotate == 1 rotate 
            n+2 rotate == 2 rotate

            d rotate = d%n rotate

            Rotate by -x places == n+(-x) rotate
            Negative rotation --> Right rotation

         */


        if (n == 0)
            return;
        
        d = d % n;

        if(d<0){
            d = n+d;
        }

        //STEP-1: copy first d elements into temp[]. arr[0,d] --> temp[0,d]
        int[] temp = new int[d];
        for(int i=0;i<d;i++){
            temp[i] = arr[i];
        }

        //STEP-2: Left shift all remaining elments arr[d,n] by 1 place  --> arr[i-d] = arr[i]
        for(int i=d;i<n;i++){
            arr[i-d] = arr[i]; //Left shift d places
        }

        //STEP-3: copy elements from temp[] to last d places. temp[0,d] --> arr[n-d,n]
        for(int i=n-d;i<n;i++){
            arr[i] = temp[i-(n-d)];
        }

      }
    public static void main(String args[]) {
        int n = 7;
        int[] arr = {1,2,3,4,5,6,7};

        int d = 2;
        Rotatetoleft(arr, n, d);
        System.out.println("After Rotating the elements to left by "+d+" places");
        for (int i = 0; i < n; i++) {
          System.out.print(arr[i] + " ");
        }

        int[] arr1 = {1,2,3,4,5,6,7};
        d = -2;
        Rotatetoleft(arr1, n, d);
        System.out.println("\nAfter Rotating the elements to left by "+d+" places");
        for (int i = 0; i < n; i++) {
          System.out.print(arr1[i] + " ");
        }
      }
}
