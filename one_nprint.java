import java.util.*;
public class one_nprint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter range:");
        int range=sc.nextInt();
        int c=1;
        while(c<=range){
            System.out.print(c+" ");
            c++;
        }
        System.out.println();
    }
}
