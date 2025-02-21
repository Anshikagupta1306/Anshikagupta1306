import java.util.*;
public class remove_duplicatestr {
    public static void remove(String arr,int i,StringBuilder newstr,boolean map[]){
        if(i==arr.length()){
            System.out.println(newstr);
            return;
        }
        char curr=arr.charAt(i);
        if(map[curr-'a']==true){
            remove(arr, i+1, newstr, map);
        }
        else{
            map[curr-'a']=true;
            remove(arr, i+1, newstr.append(curr), map);
        }
    }
    public static void main(String[] args) {
        String str="appnnaaacollegean";
        remove(str, 0, new StringBuilder(""),new boolean[26]);
    }
}
