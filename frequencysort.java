import java.util.*;
public class frequencysort {
    public static ArrayList<Integer> sort(int arr[]){
        HashMap<Integer,Integer>freqmap=new HashMap<>();
        for (int num : arr) {
            freqmap.put(num,freqmap.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> resuList =new ArrayList<>();
        for (int num : arr) {
            resuList.add(num);
        }
        Collections.sort(resuList,new Comparator<Integer>() {
           public int compare(Integer a,Integer b){
            int freqA=freqmap.get(a);
            int freqB=freqmap.get(b);
            if(freqA!=freqB){
                return freqB-freqA;
            }
            else {
                return a-b;
            }
           } 
        });
        return resuList;
    }
    public static void main(String[] args) {
     int arr[]={1,3,2,2,4,1,3,1};
     ArrayList<Integer> ans=sort(arr);
     System.out.println(ans);   
    }
}
