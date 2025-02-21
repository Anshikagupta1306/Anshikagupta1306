import java.util.*;
public class friends_pairing {
    public static int ways(int n){
        if(n==1||n==2){
            return n;
        }
        int fnm1=ways(n-1);
        int fnm2=ways(n-2);
        int pairs=(n-1)*fnm2;
      int totways=fnm1+pairs;
      return totways;
    }
    public static void main(String[] args) {
        System.out.println(ways(3));
    }
}
