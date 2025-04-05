public class Smallest {

    public static int findSmallestElement(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i:arr){
            if(i<min){
                min = i;
            }
        }

        return min;
    }
    public static void main(String args[]) {
        int arr1[] =  {2,5,1,3,0};
        System.out.println("The Smallest element in the array is: "+findSmallestElement(arr1));
     
        int arr2[] =  {8,10,5,7,9};
        System.out.println("The Smallest element in the array is: "+findSmallestElement(arr2));
    }    
}
