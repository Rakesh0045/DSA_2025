import java.util.Scanner;

public class print1toN_BackTrack {
    public static void f(int i,int n){
        if(i<1){
            return;
        }
        f(i-1,n);
        System.out.print(i+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Printing 1 to "+n+" using backward recursion: ");
        f(n,n);
        sc.close();
    }
}
