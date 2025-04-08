import java.util.ArrayList;

public class InterSectionOfArrays {

    public static ArrayList<Integer> InterSection(int[] a, int[] b, int n, int m) {
        ArrayList<Integer> Intersection = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                if (Intersection.size() == 0 || Intersection.get(Intersection.size() - 1) != a[i]) {
                    Intersection.add(a[i]);
                }
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
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
