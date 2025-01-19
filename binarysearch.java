import java.util.*;
public class binarysearch {
    public static int search(int numbers[],int key){
        int start=0;
        int end=numbers.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            else if(numbers[mid]<key){
                start=mid+1;
            }
            else{
                start=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={2,3,7,8,9};
        int key=8;
        System.out.println("index of the key is:"+search(numbers, key));
    }
}
