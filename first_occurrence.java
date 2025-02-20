import java.util.*;
public class first_occurrence {
    public static int occur(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return occur(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[]={8,3,6,5,9,5,1,5};
        System.out.println(occur(arr, 5, 0));
    }
}
