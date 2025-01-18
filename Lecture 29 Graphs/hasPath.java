import java.util.*;

public class hasPath{
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s,int d, int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    static void createGraph(ArrayList<Edge>graph[]){  //TC O(V+E) || O(n^2) for matrix
        for(int i=0;i<graph.length;i++){
            graph[i]= new ArrayList<>();
        }

        //0 vertex
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

        //1 vertex
        graph[1].add(new Edge(1,3,1));
        graph[1].add(new Edge(1,0,1));

        //2 vertex
        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,5,1));

        //3 vertex
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,5,1));

        //5 vertex
        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));

        //5 vertex
        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));

        //6 vertex
        graph[6].add(new Edge(6,5,1));
    }


    public static void dfs(ArrayList<Edge>[] graph,int curr,boolean vis[]){ //O(V+E)
        System.out.print(curr+" ");
        vis[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph,e.dest,vis);
            }
        }

    }

    public static boolean hasPath(ArrayList<Edge>[] graph,int src,int dest,boolean visited[]){
        if(src==dest){
            return true;

        }
        for(int i=0;i<graph[src].size();i++){
            Edge e = graph[src].get(i);

            //e.dest==neighbour
            visited[src]=true;
            if(!visited[e.dest] && hasPath(graph,e.dest,dest,visited)){
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]){
        int v=7;
        //int arr[]=new int[v];
        ArrayList<Edge>[] graph = new ArrayList[v]; //null-> empty arraylist
        createGraph(graph);
      System.out.print(hasPath(graph,0,5,new boolean[v]));
    }
}