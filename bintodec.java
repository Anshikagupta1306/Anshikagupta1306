import java.util.*;
public class bintodec {
    public static void bintodec(int bin){
        int mynum=bin;
        int pow=0;
        int dec=0;
        while(bin>0){
            int last=bin%10;
            dec=dec+(last*(int)Math.pow(2, pow));
            pow++;
            bin=bin/10;
        }
        System.out.println("decimal of "+mynum+" is: "+dec);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr binary number:");
        int bi=sc.nextInt();
        bintodec(bi);
    }
}
