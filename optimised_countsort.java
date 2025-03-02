import java.util.*;
public class optimised_countsort {
    public static void sort(int nums[]){
       int largest=Integer.MIN_VALUE;
       for(int i=0;i<nums.length;i++){
        largest=Math.max(largest, nums[i]);
       }
    int count[]=new int[largest+1];
    for(int i=0;i<nums.length;i++){
        count[nums[i]]++;
    }
    for(int i=1;i<count.length;i++){
        count[i]+=count[i-1];
    }
    int output[]=new int[nums.length];
    for(int i=nums.length-1;i>=0;i--){
      int idx=nums[i];
      int j=count[idx]-1;
      output[j]=nums[i];
      count[idx]--;
      }
      for(int i=0;i<nums.length;i++){
        nums[i] = output[i];
    }
    }
    public static void printarr(int nums[]){
        for (int i=0;i<nums.length;i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
      int nums[]={8,5,3,1,5,3,6};
      sort(nums);
      printarr(nums);  
    } 
}
