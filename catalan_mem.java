import java.util.*;
public class catalan_mem {
    public static int mem(int n,int dp[]){
        int ans=0;
        if(n==0||n==1){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        for(int i=0;i<n;i++){
            ans+=mem(i, dp)*mem(n-i-1, dp);
        }
      return dp[n]=ans;
    }
    public static void main(String[] args) {
        int n=4;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(mem(n, dp));
    }
}
