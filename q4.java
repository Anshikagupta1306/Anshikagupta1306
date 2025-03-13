import java.util.*;
public class q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int result=0;
        int place=1;
        if(num==0){
            result=1;
        }
        else{
           while(num>0){
             int digit=num%10;
             if(digit==0){
                digit=1;
             }
             result=result+digit*place;
             place*=10;
             num/=10;
           }
        }
        System.out.println(result);
    }
}
