import java.util.*;
public class Count1inBSA {
    public static int countone(int arr[]){
        int si=0;
        int ei=arr.length-1;
        int count=0;
        while(si<=ei){
            int mid=si+(ei-si)/2;
            if(arr[mid]==0){
                ei=mid-1;
            }
            else if(mid==arr.length-1||arr[mid+1]!=1){
                count=mid+1;
                break;
            }
            else{
              si=mid+1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(countone(arr));
    }
}
