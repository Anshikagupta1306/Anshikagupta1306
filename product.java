import java.util.*;
public class product {
    public static int multiply(int a , int b){
        int p=a*b;
        return p;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a:");
        int a = sc.nextInt();
        System.out.println("enter b:");
        int b=sc.nextInt();
        System.out.println("a*b="+multiply(a, b));
    }
}
