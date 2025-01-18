import java.util.*;
public class linearsearch {
    public static int search(int key,int nums[]){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,20};
        int key=2;
        int idx=search(key, numbers);
        if(idx==-1){
            System.out.println("key not found");
        }
        else{
            System.out.println("key is found at idx:"+idx);
        }
    }
}
