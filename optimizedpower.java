import java.util.*;
public class optimizedpower {
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int halfpower=power(x, n/2);
        int halfpowersq=halfpower*halfpower;
        if(n%2!=0){
            halfpowersq=x*halfpowersq;
        }
        return halfpowersq;
    }
    public static void main(String[] args) {
        System.out.println(power(2, 10));
    }
}
