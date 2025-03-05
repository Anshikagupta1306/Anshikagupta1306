import java.util.*;
public class catalan_rec {
    public static int rec(int n){
        int ans=0;
        if(n==0||n==1){
            return 1;
        }
        for(int i=0;i<=n-1;i++){
            ans+=rec(i)*rec(n-i-1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(rec(n));
    }
}
