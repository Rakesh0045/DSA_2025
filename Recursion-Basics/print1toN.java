import java.util.Scanner;

public class print1toN {
    public static void f(int i,int n){
        if(i>n){
            return;
        }
        System.out.print(i+" ");
        f(i+1,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Printing 1 to "+n+" using forward recursion: ");
        f(1,n);
        sc.close();
    }
}
