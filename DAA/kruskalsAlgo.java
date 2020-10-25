package DAA;

public class kruskalsAlgo {
    class Edge implements Comparable<Edge>{
        int src, dest, weight;

        public int compareTo(Edge compareEdge){
            return this.weight - compareEdge.weight;
        }
    };

    class subset{
        int parent, rank;
    };

    int vertices, edges;
    Edge edge[];

    kruskalsAlgo(int v, int e){
        vertices = v;
        edges = e;
        edge = new Edge[edges];
        for(int i = 0; i < e; i++) edge[i] = new Edge();
    }

    int find(subset subsets[], int i){
        if(subsets[i].parent != i) subsets[i].parent = find(subsets, subsets[i].parent);
        return subsets[i].parent;
    }

    void Union(subset subsets[], int x, int y){
        int xroot = find(subsets, x);
        int yroot = find(subsets, y);

        if (subsets[xroot].rank < subsets[yroot].rank) subsets[xroot].parent = yroot;
        else if (subsets[xroot].rank > subsets[yroot].rank) subsets[yroot].parent = xroot;
        else {
            subsets[yroot].parent = xroot;
            subsets[xroot].rank++;
        }
    }

    void KruskalAlgo(){
        
    }

}
