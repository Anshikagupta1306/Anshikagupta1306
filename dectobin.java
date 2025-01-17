import java.util.*;
public class dectobin {
    public static void dectobin(int dec){
        int mynum=dec;
        int pow=0;
        int bin=0;
        while(dec>0){
            int rem=dec%2;
            bin=bin+(rem*(int)Math.pow(10,pow));
            pow++;
            dec=dec/2;
        }
        System.out.println("binary form of "+mynum+" is: "+bin);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter decimal number:");
        int dec=sc.nextInt();
        dectobin(dec);
    }
}
