import java.util.*;
public class maxarr_prefix {
    public static void maxprefix(int nums[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        for(int i=0;i<nums.length;i++){
            int start=i;
            for(int j=0;j<nums.length;j++){
                int end=j;
                currsum=start==0?prefix[end]:prefix[end]-prefix[start-1];
               if(maxsum<currsum){
                maxsum=currsum;
               }
            }
        }
        System.out.println("max sum="+maxsum);
    }
    public static void main(String[] args) {
        int nums[]={1,-2,6,-1,3};
        maxprefix(nums);
    }
}
