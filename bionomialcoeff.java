import java.util.*;
public class bionomialcoeff {
    public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static int bc(int n,int r){
        int fact_n=fact(n);
        int fact_r=fact(r);
        int fact_nr=fact(n-r);
        int bc=fact_n/(fact_r*fact_nr);
        return bc;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        System.out.println("enter r");
        int r=sc.nextInt();
        System.out.println("bionomial coefficient:"+bc(n,r));
    }
}
