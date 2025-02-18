import java.util.*;
public class setithbit {
    public static int setbit(int n,int i){
        int bitmask=1<<i;
        return n|bitmask;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();
        System.out.println(setbit(n, i));
    }
}
