public class SecondSmallest {
    public static int findSecondSmallestElement(int[] arr){
        int min = arr[0];
        int sec = Integer.MAX_VALUE;
        for(int i:arr){
            if(i<min){
                sec = min;
                min = i;
            }else if(i>min && i<sec){
                sec = i;
            }
        }

        return sec;
    }
    public static void main(String args[]) {
        int arr1[] =  {2,5,1,3,0};
        System.out.println("The Second Smallest element in the array is: "+findSecondSmallestElement(arr1));
     
        int arr2[] =  {8,10,5,7,9};
        System.out.println("The Second Smallest element in the array is: "+findSecondSmallestElement(arr2));
    }    
}
