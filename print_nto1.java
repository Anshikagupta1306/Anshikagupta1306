import java.util.*;
public class print_nto1 {
    public static void print(int n){
      if(n==1){
        System.out.print(n);
        return;
      }
      System.out.print(n+" ");
      print(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print(n);
    }
}
