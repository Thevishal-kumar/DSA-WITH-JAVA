import java.util.*;

public class BellmanFord{
     static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s,int d,int wt){
            this.src=s;
            this.dest=d;
            this.wt=wt;
        }
    }
    static void createGraph(ArrayList<Edge>graph[]){  
        for(int i=0;i<graph.length;i++){
            graph[i]= new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,2,-4));
        
        //2 vertex
        graph[2].add(new Edge(2,3,2));

        //3 vertex
        graph[3].add(new Edge(3,4,4));

        //4 vertex
        graph[4].add(new Edge(4,1,-1));
       
    }

    static void createGraph2(ArrayList<Edge>graph){  
        
        graph.add(new Edge(0,1,2));
        graph.add(new Edge(0,2,4));

        graph.add(new Edge(1,2,-4));
        
        //2 vertex
        graph.add(new Edge(2,3,2));

        //3 vertex
        graph.add(new Edge(3,4,4));

        //4 vertex
        graph.add(new Edge(4,1,-1));
       
    }

    public static void bellmanFord(ArrayList<Edge>graph,int src,int V){
        int dist[]=new int[V];
        for(int i=0;i<dist.length;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }
        //O(V*E)
        //algo -O(V)
        
        for(int i=0;i<V-1;i++){
            //edges-O(E),
            for(int j=0;j<graph.size();j++){
                    Edge e = graph.get(j);
                    //u,v,wt
                    int u=e.src;
                    int v=e.dest;
                    int wt=e.wt;

                    //relaxation
                    if(dist[u] != Integer.MAX_VALUE && dist[u] + wt<dist[v]){
                        dist[v]=dist[u] + wt;
                    }
                }
            }
             
        //print
        for(int i=0;i<dist.length;i++){
            System.out.print(dist[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int v=5;
        //int arr[]=new int[v];
        // ArrayList<Edge>[] graph = new ArrayList[v];//null-> empty arraylist
        //createGraph(graph);
        ArrayList<Edge>graph = new ArrayList<>();
        createGraph2(graph);
        int src=0;
        bellmanFord(graph,src,5);
   }
}