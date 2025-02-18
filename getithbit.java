import java.util.*;
public class getithbit {
    public static int getbit(int n,int i){
        int bitmask=i<<i;
        if((n&bitmask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();
        System.out.println(getbit(n, i));
    }
}
