import java.util.*;
public class undirectedcycle {
   static class edge{
    int src;
    int des;

    public edge(int s,int d){
        this.src=s;
        this.des=d;
    }
  }    
  static void creategraph(ArrayList<edge>graph[]){
    for(int i=0;i<graph.length;i++){
        graph[i]=new ArrayList<>();
    }
    graph[0].add(new edge(0, 1));
    graph[0].add(new edge(0, 2));
    graph[0].add(new edge(0, 3));

    graph[1].add(new edge(1,0));
    graph[1].add(new edge(1,2));

    graph[2].add(new edge(2,0));
    graph[2].add(new edge(2,1));
    
    graph[3].add(new edge(3,0));
    graph[3].add(new edge(3,4));

    graph[4].add(new edge(4,3));
  }
public static boolean detectcycle(ArrayList<edge>graph[]){
    boolean vis[] =new boolean[graph.length];
    for(int i=0;i<graph.length;i++){
      if(!vis[i]){
       if(detectcycleutil(graph,vis,i,-1)){
        return true;
       }
      }
    }
    return false;
}
public static boolean detectcycleutil(ArrayList<edge> graph[],boolean vis[],int curr,int par){
  vis[curr]=true;

  for(int i=0;i<graph[curr].size();i++){
    edge e = graph[curr].get(i);
    //case-3
    if(!vis[e.des]){
      if(detectcycleutil(graph,vis,e.des,curr)){
        return true;
      }
    }
    //case-1
    else if(vis[e.des] && e.des!=par){
      return true;
    }
    //case-2 ->do nothing
  }
  return false;
}
public static void main(String args[]){
    /*
     *                0----3
     *               /|    |
     *              / |    |
     *             1  |    4
     *              \ |
     *                2
     */
    int v=5;
    ArrayList<edge> graph[]=new ArrayList[v];
    creategraph(graph);
   System.out.println(detectcycle(graph));
}
}