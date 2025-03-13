import java.util.*;
public class Q5 {
    public static void newarr(int arr[]){
        for(int i=0;i<arr.length-1;i+=2){
            if(arr[i]>arr[i+1]){
                int temp=arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=temp;
            }
            
            if(i+2<arr.length &&arr[i+1]<arr[i+2]){
                int temp=arr[i+2];
                arr[i+2]=arr[i+1];
                arr[i+1]=temp;
            }
        }
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int j=0;j<n;j++){
                arr[j]=sc.nextInt();
            }
           newarr(arr);
           printarr(arr);
        }
    }
}

