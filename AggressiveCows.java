import java.util.*;
public class AggressiveCows{
    public static boolean canweplace(int arr[],int dis,int cows){
        int countcows=1;
        int lastcoord=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-lastcoord>=dis){
                countcows++;
                lastcoord=arr[i];
            }
        }
        if(countcows>=cows){
            return true;
        }
        return false;
    }
    public static int minmax(int arr[],int cows){
        Arrays.sort(arr);
        int si=1;
        int n=arr.length;
        int ei=arr[n-1]-arr[0];
        int ans=-1;
        while(si<=ei){
            int mid=si+(ei-si)/2;
            if(canweplace(arr,mid,cows)==true){
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
        int k=sc.nextInt();
        System.out.println(minmax(arr, k));
    }
}