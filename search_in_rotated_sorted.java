import java.util.*;
public class search_in_rotated_sorted {
    public static int search(int arr[],int k,int si,int ei){
        if(si>ei){
            return -1;
        }
        int mid=si+(ei-si)/2;
        if(arr[mid]==k){
            return mid;
        }
        if(arr[si]<=arr[mid]){
            if(arr[si]<=k && k<=arr[mid]){
                return search(arr, k, si, mid-1);
            }
            else{
                return search(arr, k, mid+1, ei);
            }
        }
        else{
            if(arr[mid]<=k && k<=arr[ei]){
                return search(arr, k, mid+1, ei);
            }
            else{
                return search(arr, k, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        System.out.println(search(arr, 0, 0, arr.length));
    }
}
