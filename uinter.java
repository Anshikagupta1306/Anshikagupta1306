import java.util.*;
public class uinter {
    public static void main(String args[]){
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,6,2,4};
        HashSet<Integer> set=new HashSet<>();
        //union
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        System.out.println("union = "+set.size());
        set.clear();
        //intersection
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        int c=0;
        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
               c++;
               set.remove(arr2[i]);
            }
        }
        System.out.println("intersection = "+c);
    }
}
