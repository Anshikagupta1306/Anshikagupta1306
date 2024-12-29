import java.util.*;
public class hashmap{
    public static void main(String args[]){
        //create
        HashMap<String,Integer>hm=new HashMap<>();
        //insert 
        hm.put("India",100);
        hm.put("china",200);
        hm.put("nepal",50);
        //print
        System.out.println(hm);
        //size
        System.out.println(hm.size());
        //get any alue using its key
        int pop=hm.get("India");
        System.out.println("population of India:"+pop);
        //check if key exists
        System.out.println(hm.containsKey("India"));
        //remove
        System.out.println(hm.remove("nepal"));
        System.out.println(hm);
        //clear
        hm.clear();
        //check if hashmap is empty
        System.out.println(hm.isEmpty());
    }
}