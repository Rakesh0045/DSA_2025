public class Reverse_Array {
    public static void rev(int[] a, int i) {
        if (i >= a.length / 2) {
            return;
        }
        int temp = a[i];
        a[i] = a[a.length - i - 1];
        a[a.length - i - 1] = temp;
        rev(a, i + 1);
    }

    public static void main(String[] args) {
        int[] a = { 1, 3, 2, 5, 4 };
        System.out.println("See the Array after reversing: ");
        rev(a, 0);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}