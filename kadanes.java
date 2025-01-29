import java.util.*;
public class kadanes {
    public static void maxarr(int nums[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            currsum=currsum+nums[i];
            maxsum=Math.max(currsum,maxsum);
            if(currsum<0){
                currsum=0;
            }
        }
        System.out.println("max sum="+maxsum);
    }
    public static void main(String[] args) {
        int nums[]={-1,-3,4,-1,-2,1,5,-3};
        maxarr(nums);
    }
}
