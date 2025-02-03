import java.util.*;
public class selectionsort {
    public static void sort(int nums[]){
        for(int i=0;i<nums.length;i++){
            int minpos=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[minpos]>nums[j]){
                    minpos=j;
                }
            }
            int temp=nums[minpos];
            nums[minpos]=nums[i];
            nums[i]=temp;
        }
    }
    public static void print(int nums[]){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nums[]={5,4,1,2,3};
        sort(nums);
        print(nums);
    }
}
