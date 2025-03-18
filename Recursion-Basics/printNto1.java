import java.util.Scanner;

public class printNto1 {
    public static void f(int i,int n){
        if(i<1){
            return;
        }
        System.out.print(i+" ");
        f(i-1,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Printing "+n+" to 1 using forward recursion: ");
        f(n,n);
        sc.close();
    }
}
