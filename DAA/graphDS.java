package DAA;

import java.util.*;

public class graphDS {
    private int V;
    private LinkedList<Integer> adj[];

    graphDS(int v){
        V = v;
        adj = new LinkedList[v];
        for(int i = 0; i < v; i++) adj[i] = new LinkedList<>();
    }
    
    void addEdge(int v, int w){
        adj[v].add(w);
    }

    void dfsUtil(int v, boolean visited[]){
        visited[v] = true; 
        System.out.print(v+" "); 
  
        Iterator<Integer> i = adj[v].listIterator(); 
        while (i.hasNext()) 
        { 
            int n = i.next(); 
            if (!visited[n]) 
                dfsUtil(n, visited); 
        }
    }

    void dfs(int v){
        boolean visited[] = new boolean[V];
        
        for (int i=0; i<V; ++i) if (visited[i] == false) dfsUtil(i, visited);

    }

    void bfs(int s){
        boolean visited[] = new boolean[V]; 
  
         
        LinkedList<Integer> queue = new LinkedList<Integer>(); 
  
        visited[s]=true; 
        queue.add(s); 
  
        while (queue.size() != 0) 
        { 
            s = queue.poll(); 
            System.out.print(s+" "); 
  
            Iterator<Integer> i = adj[s].listIterator(); 
            while (i.hasNext()) 
            { 
                int n = i.next(); 
                if (!visited[n]) 
                { 
                    visited[n] = true; 
                    queue.add(n); 
                } 
            } 
        } 
    }

    void connectedComponents(){
        boolean visited[] = new boolean[V];
        for(int v = 0; v < V; v++){
            if(!visited[v]){
                dfsUtil(v, visited);
                System.out.println();
            }
        }
    }

    void topologicalSortUtil(int v, boolean visited[], Stack<Integer> stack){ 
        visited[v] = true; 
        Integer i; 
  
        Iterator<Integer> it = adj[v].iterator(); 
        while (it.hasNext()) { 
            i = it.next(); 
            if (!visited[i]) 
                topologicalSortUtil(i, visited, stack); 
        }
        stack.push(new Integer(v)); 
    } 

    void topologicalSort() 
    { 
        Stack<Integer> stack = new Stack<Integer>(); 
  
        boolean visited[] = new boolean[V]; 
        for (int i = 0; i < V; i++) 
            visited[i] = false; 
  
        for (int i = 0; i < V; i++) 
            if (visited[i] == false) 
                topologicalSortUtil(i, visited, stack); 
  
        while (stack.empty() == false) 
            System.out.print(stack.pop() + " "); 
    } 

    public static void main(String[] args) {
        graphDS g = new graphDS(4);

        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3);

        g.dfs(2);
    }
}
