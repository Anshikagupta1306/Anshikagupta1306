import java.util.*;
public class containerwithmostwater {
    public static int maxwater(ArrayList<Integer>height){
       int maxwater=0;
       int lp=0;
       int rp=height.size()-1;

       while(lp<rp){
        int ht=Math.min(height.get(lp),height.get(rp));
        int width=rp-lp;
        int stored=ht*width;
        maxwater=Math.max(maxwater, stored);

        if(height.get(lp)<height.get(rp)){
            lp++;
        }
        else{
            rp--;
        }
       }
       return maxwater;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n: ");
        int n=sc.nextInt();
        ArrayList<Integer> height=new ArrayList<>();
        for(int i=0;i<n;i++){
            int inp=sc.nextInt();
            height.add(inp);
        }
        System.out.println(maxwater(height));
    }
}
