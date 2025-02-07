import java.util.*;
public class strpallindrome {
    public static void ispall(String str){
       for(int i=0;i<str.length()/2;i++){
           int n=str.length();
           if(str.charAt(i)!=str.charAt(n-i-1)){
            System.out.println("not a pallindrome");
            return;
           }
       }
       System.out.println("is a pallindrome");
    }
    public static void main(String[] args) {
        String str="abcdef";
        ispall(str);
    }
}
