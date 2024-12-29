import java.util.*;
public class itrhm {
    public static void main(String args[]){
       HashMap<String,Integer>hm=new HashMap<>();
       hm.put("India",100);
       hm.put("China",200);
       hm.put("Nepal",50);
       hm.put("Indonesia",150);
       //iterate
       Set<String>keys=hm.keySet();
       System.out.println(keys);
       for (String k : keys) {
          System.out.println("key="+k+",value="+hm.get(k));
       }
    }
}
