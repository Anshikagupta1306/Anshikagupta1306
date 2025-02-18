import java.util.*;
public class print_1ton {
    public static void print(int n){
       if(n==1){
        System.out.print(n+" ");
        return;
       }
       print(n-1);
       System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print(n);
    }
}
