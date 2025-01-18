import java.util.*;

public class connectedComponents{
     static class Edge{
        int src;
        int dest;

        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
    static void createGraph(ArrayList<Edge>graph[]){  //TC O(V+E) || O(n^2) for matrix
        for(int i=0;i<graph.length;i++){
            graph[i]= new ArrayList<>();
        }

        //0 vertex
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        //1 vertex
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        //2 vertex
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        //3 vertex
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));

        //4 vertex
        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
    }

    
    public static void main(String args[]){
        int v=5;
        //int arr[]=new int[v];
        ArrayList<Edge>[] graph = new ArrayList[v];//null-> empty arraylist
        createGraph(graph);
       
    }
}