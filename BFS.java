import java.util.*;
public class BFS {
    static class edge{
        int src;
        int des;
        int wt;
        public edge(int s,int d,int w){
           this.src=s;
           this.des=d;
           this.wt=w;
         }
    }
    static void creategraph(ArrayList<edge>graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        //vertex-0
        graph[0].add(new edge(0,1,1));
        graph[0].add(new edge(0,2,1));
        //vertex-1
        graph[1].add(new edge(1,0,1));
        graph[1].add(new edge(1,3,1));
        //vertex-2
        graph[2].add(new edge(2,0,1));
        graph[2].add(new edge(2,4,1));
        //vertex-3
        graph[3].add(new edge(3,1,1));
        graph[3].add(new edge(3,5,1));
        graph[3].add(new edge(3,4,1));
        //vertex-4
        graph[4].add(new edge(4,2,1));
        graph[4].add(new edge(4,5,1));
        graph[4].add(new edge(4,3,1));
        //vertex-5
        graph[5].add(new edge(5,6,1));
        graph[5].add(new edge(5,3,1));
        graph[5].add(new edge(5,4,1));
        //vertex-6
        graph[6].add(new edge(6, 5, 1));
    }   
    public static void BFS(ArrayList<edge>graph[]){
        Queue<Integer> q= new LinkedList<>();
        boolean vis[]=new boolean[graph.length];
        q.add(0);//source=0
        while(!q.isEmpty()){
            int curr=q.remove();
            if(!vis[curr]){
                System.out.print(curr+" ");
                vis[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    edge e=graph[curr].get(i);
                    q.add(e.des);
                }
            }
        }
    }
 public static void main(String[] args) {
        /*
         *              1----3
         *             /     | \
         *            0      |  5--6
         *            \      | /
         *             2-----4
         */
        int v=7;
    ArrayList<edge>graph[]=new ArrayList[v];
    creategraph(graph);
    BFS(graph);
    }
}
