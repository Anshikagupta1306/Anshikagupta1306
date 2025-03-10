import java.util.*;
public class friendly_pair {
    public static int sum(int num){
        int sum=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        return sum;
    }
    public static boolean abundant_numbers(int nums1,int nums2){
          int sum1=sum(nums1);
          int sum2=sum(nums2);
          return (sum1==nums1)&&(sum2==nums2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        if(abundant_numbers(num1, num2)){
            System.out.println("Abundant Numbers");
        }
        else{
            System.out.println("Not Abundant Numbers");
        }
    }
}
