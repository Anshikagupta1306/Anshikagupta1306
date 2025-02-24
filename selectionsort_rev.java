import java.util.*;
public class selectionsort_rev {
    public static void decreasing(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int maxpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[maxpos]<arr[j]){
                    maxpos=j;
                }
            }
            int temp=arr[maxpos];
            arr[maxpos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        decreasing(arr);
        printarr(arr);
    }
}
