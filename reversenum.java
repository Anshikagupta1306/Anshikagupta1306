import java.util.*;
public class reversenum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to reverse:");
        int n=sc.nextInt();
        while(n>0){
            int lastdig=n%10;
            System.out.print(lastdig+" ");
            n=n/10;
        }
        System.out.println();
    }
}
