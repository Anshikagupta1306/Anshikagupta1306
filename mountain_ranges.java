import java.util.*;
public class mountain_ranges {
    public static int mountain(int n){
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<n+1;i++){
         for(int j=0;j<i;j++){
            dp[i]+=dp[j]*dp[i-j-1];
         }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n=3;
        System.out.println(mountain(n));
    }
}
