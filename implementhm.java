import java.util.*;
public class implementhm {
    static class HashMap<k,v>{
       private class Node{
        k key;
        v Value;
        
        public Node(k key,v value){
            this.key=key;
            this.Value=value;
        }
       }
       private int n;
       private int N;
       private LinkedList<Node>buckets[];//N=buckets.length
       @SuppressWarnings("unchecked")
       public HashMap(){
        this.N=4;
        this.buckets=new LinkedList[4];
        for(int i=0;i<4;i++){
            this.buckets[i]=new LinkedList<>();
        }
       }
       private int hashFunction(k key){
        int hc=key.hashCode();
        return Math.abs(hc)%N;
       }
       private int searchInLL(k key,int bi){
          LinkedList<Node> ll=buckets[bi];
          int di=0;
          for(int i=0;i<ll.size();i++){
            Node node=ll.get(i);
            if(node.key==key){
                return di;
            }
            di++;
          }
          return -1;
       }
       
       @SuppressWarnings("unchecked")
       private void rehash(){
        LinkedList<Node>oldbuck[]=buckets;
        buckets=new LinkedList[N*2];
        N=2*N;
        for(int i=0;i<buckets.length;i++){
            buckets[i]=new LinkedList<>();
        }
        //nodes->add in bucket
        for(int i=0;i<oldbuck.length;i++){
           LinkedList<Node> ll=oldbuck[i];
           for(int j=0;j<ll.size();j++){
             Node node = ll.get(j);
             put(node.key,node.Value);
           }
        }
       }
       public void put(k key,v value){ //O(lambda) or O(1)
          int bi=hashFunction(key);
          int di=searchInLL(key,bi);// valid or -1
          
          if(di!=-1){
             Node node = buckets[bi].get(di);
             node.Value=value;
          }
          else{
            buckets[bi].add(new Node(key,value));
            n++;  
        }
        double lambda=(double)n/N;
        if(lambda>2.0){
            rehash();
        } 
       }
       public boolean containsKey(k key){
        int bi=hashFunction(key);
        int di=searchInLL(key,bi);
        if(di!=-1){
            return true;
        }
        else{
            return false;
        }
       }
       public v remove(k key){
        int bi=hashFunction(key);
          int di=searchInLL(key,bi);// valid or -1
          
          if(di!=-1){
             Node node = buckets[bi].remove(di);
             return node.Value;
          }
          else{
           return  null; 
        } 
       }
       public v get(k key){
        int bi=hashFunction(key);
        int di=searchInLL(key,bi);// valid or -1
        
        if(di!=-1){
           Node node = buckets[bi].get(di);
           n--;
           return node.Value;
        }
        else{
          return null; 
      }
       }
       public ArrayList<k> keyset(){
        ArrayList<k> keys=new ArrayList<>();
         for(int i=0;i<buckets.length;i++){
            LinkedList<Node>ll=buckets[i];
            for(Node node:ll){
                keys.add(node.key);
            }
       }
       return keys;
    }
    public boolean isEmpty(){
        return n==0;
    }
}
       public static void main(String args[]){
          HashMap<String,Integer>hm=new HashMap<>();
           hm.put("India",100);
           hm.put("china",250);
           hm.put("nepal",50);
           hm.put("us",200);
           ArrayList<String>keys=hm.keyset();
           for(String key:keys){
            System.out.println(key);
           }
       }
 } 
