import java.util.*;
public class primesinrange {
    public static boolean isprime(int n){
        boolean isprime=true;
        if(n==2){
            return true;
        }
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                isprime=false;
            }
        }
        return isprime;
    }
    public static void primes(int n){
        for(int i=2;i<=n;i++){
            if(isprime(i)){
                System.out.println(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        primes(n);
    }
}
