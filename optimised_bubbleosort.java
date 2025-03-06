import java.util.*;
public class optimised_bubbleosort {
    public static void sort(int nums[]){
        for(int turn=0;turn<nums.length-1;turn++){
            boolean swapped=false;
            for(int j=0;j<nums.length-1-turn;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    swapped=true;
                }
            }
            if(swapped==false){
                break;
            }
        }
    }
    public static void printarr(int nums[]){
        for(int i=0;i<nums.length-1;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nums[]={2,8,3,9,5,0};
        sort(nums);
        printarr(nums);
    }
}
