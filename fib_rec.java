import java.util.*;
public class fib_rec {
    public static int fib(int n){
        if(n==0||n==1){
            return n;
        }
        int f=fib(n-1)+fib(n-2);
        return f;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fib(n));
    }
}
