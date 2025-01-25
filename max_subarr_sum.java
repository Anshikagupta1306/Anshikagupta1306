import java.util.*;
public class max_subarr_sum {
    public static void maxsum(int nums[]){
       int currsum=0;
       int maxsum=Integer.MIN_VALUE;
       for(int i=0;i<nums.length;i++){
        int start=i;
        for(int j=i;j<nums.length;j++){
            int end=j;
            currsum=0;
            for(int k=start;k<=end;k++){
                currsum+=nums[k];
            }
            System.out.println(currsum);
        }
            if (maxsum<currsum) {
                maxsum=currsum;
            }
       }
       System.out.println("max sum is:"+maxsum);
    }
    public static void main(String[] args) {
        int nums[]={2,4,6,8,10};
        maxsum(nums);
    }
}
