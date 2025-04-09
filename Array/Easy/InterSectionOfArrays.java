import java.util.ArrayList;

public class InterSectionOfArrays {

    public static ArrayList<Integer> InterSection(int[] a, int[] b, int n, int m) {
        ArrayList<Integer> Intersection = new ArrayList<>();
        int i = 0;
        int j = 0;

        // while (i < a.length && j < b.length) {
        //     if (a[i] == b[j]) {
        //         if (Intersection.size() == 0 || Intersection.get(Intersection.size() - 1) != a[i]) {
        //             Intersection.add(a[i]);
        //         }
        //         i++;
        //         j++;
        //     } else if (a[i] < b[j]) {
        //         i++;
        //     } else {
        //         j++;
        //     }
        // }


        /*
         
            Approach (2 pointer)
            --------

            * i=0, j=0
            * Traverse a[], b[] 
            * If found distinct element a[i]!=b[j] (greater than or less than) then move the corresponding pointer
            * If a[i] < b[j] --> move i pointer to get bigger element which may be same as b[j]
            * If b[j] < a[i] --> move j pointer to find bigger element which may be same as a[i]
            * If found common intersect element i.e a[i]==b[j] then add any of those to intersect<> and move both pointers to find next pair of intersect



         */

        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                i++;
            }else if(b[j]<a[i]){
                j++;
            }else if(a[i] == b[j]){
                Intersection.add(a[i]);
                i++;
                j++;
            }
        }

        return Intersection;
    }

    public static void main(String args[]) {
        int n = 10, m = 7;
        int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int arr2[] = { 2, 3, 4, 4, 5, 11, 12 };
        ArrayList<Integer> Intersection = InterSection(arr1, arr2, n, m);
        System.out.println("Intersection of arr1 and arr2 is ");
        for (int val : Intersection)
            System.out.print(val + " ");
    }
}
