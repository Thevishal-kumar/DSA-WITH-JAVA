import java.util.*;

public class KosarajuAlgo{
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
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        //1 vertex
        graph[1].add(new Edge(1,0));

        //2 vertex
        graph[2].add(new Edge(2,1));

        //3 vertex
        graph[3].add(new Edge(3,4));
       
    }

    public static void topSort(ArrayList<Edge>graph[],int curr,boolean vis[],Stack<Integer>s){
        vis[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                topSort(graph,e.dest,vis,s);
            }
        }
        s.push(curr);
    }


     public static void dfs(ArrayList<Edge>[] graph,int curr,boolean vis[]){ 
        vis[curr]=true;
        System.out.print(curr+" ");

        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph,e.dest,vis);
            }
        }

    }

    public static void kosaraju(ArrayList<Edge>graph[],int v){
        //steps 1
        Stack<Integer>s=new Stack<>();
        boolean vis[]=new boolean[v];
        for(int i=0;i<v;i++){
            if(!vis[i]){
                topSort(graph,i,vis,s);
            }
        }

        //step 2
         ArrayList<Edge>transpose[] = new ArrayList[v];
         for(int i=0;i<graph.length;i++){
            vis[i]=false;
            transpose[i]= new ArrayList<Edge>();
        }

        for(int i=0;i<v;i++){
            for(int j=0;j<graph[i].size();j++){
                Edge e=graph[i].get(j);//e.src -> e.dest
                transpose[e.dest].add(new Edge(e.dest,e.src));//reverse edge
            }
        }

        //step3
        while(!s.isEmpty()){
            int curr = s.pop();
            if(!vis[curr]){
                System.out.print("SCC ->");
                dfs(transpose,curr,vis);
                System.out.println();
            }

        }
    }


    public static void main(String args[]){
        int v=5;
        //int arr[]=new int[v];
        ArrayList<Edge>[] graph = new ArrayList[v]; //null-> empty arraylist
        createGraph(graph);
        kosaraju(graph,v);
        
    }
}