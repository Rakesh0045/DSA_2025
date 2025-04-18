class Largest {

    public static int findLargestElement(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i:arr){
            if(i>max){
                max = i;
            }
        }

        return max;
    }
    public static void main(String args[]) {
        int arr1[] =  {2,5,1,3,0};
        System.out.println("The Largest element in the array is: "+findLargestElement(arr1));
     
        int arr2[] =  {8,10,5,7,9};
        System.out.println("The Largest element in the array is: "+findLargestElement(arr2));
    }    
}