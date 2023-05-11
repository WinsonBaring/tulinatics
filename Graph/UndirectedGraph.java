package Graph;

import java.util.ArrayList;

public class UndirectedGraph extends Graph {

    public void addVertex(int v) {
        while (v >= adjacencyList.size()) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        addVertex(u);
        addVertex(v);
        adjacencyList.get(u).add(v);
        adjacencyList.get(v).add(u);
    }

    public ArrayList<Integer> getNeighbors(int v) {
        return adjacencyList.get(v);
    }
}
