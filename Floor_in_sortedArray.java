import java.util.*;
public class Floor_in_sortedArray {
   public static int findfloor(int arr[],int x){
     int ei=arr.length-1;
     int si=0;
     int ans=-1;
     while(si<=ei){
        int mid=si+(ei-si)/2;
     if(arr[mid]<=x){
        ans=mid;
        si=mid+1;
     }
     else{
        ei=mid-1;
     }
    }
     return ans;
   }    
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int x=sc.nextInt();
    System.out.println(findfloor(arr, x));
   }
}
