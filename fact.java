import java.util.*;
public class fact {
    public static int fact(int n){
    if(n==0||n==1){
        return 1;
    }
    int f=n*fact(n-1);
    return f;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fact(n));
    }
}
