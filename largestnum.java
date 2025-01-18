import java.util.*;
public class largestnum {
    public static int largestnums(int nums[]){
     int largest=Integer.MIN_VALUE;
     for(int i=0;i<nums.length;i++){
        if(nums[i]>largest){
            largest=nums[i];
        }
     }
     return largest;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,8};
        System.out.println("largest value is:"+largestnums(nums));
    }
}
