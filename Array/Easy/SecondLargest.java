public class SecondLargest {
    public static int findSecondLargestElement(int[] arr){
        int max = arr[0];
        int sec = Integer.MIN_VALUE;
        for(int i:arr){
            if(i>max){
                sec = max;
                max = i;
            }else if(i<max && i>sec){
                sec = i;
            }
        }

        return sec;
    }
    public static void main(String args[]) {
        int arr1[] =  {2,5,1,3,0};
        System.out.println("The Second Largest element in the array is: "+findSecondLargestElement(arr1));
     
        int arr2[] =  {8,10,5,7,9};
        System.out.println("The Second Largest element in the array is: "+findSecondLargestElement(arr2));
    }    
}
