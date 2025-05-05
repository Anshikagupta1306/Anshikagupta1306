import java.util.*; 
public class fib_mem {
    public static int fibmem(int n,int f[]){
        if(n==0||n==1){
            return 1;
        }
        if(f[n]!=0){
            return f[n];
        }
        f[n]=fibmem(n-1, f)+fibmem(n-2, f);
        return f[n];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f[]=new int[n+1];
        System.out.println(fibmem(n, f));
        sc.close();
    }
}
