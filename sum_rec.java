import java.util.*;
public class sum_rec {
    public static int sum(int n){
        int sum=0;
        if(n==1){
            return 1;
        }
        int sum1=sum(n-1);
        sum+=n+sum1;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sum(n));
    }
}
