package Graph;

import java.util.ArrayList;

public class DirectedGraph extends Graph{
    @Override
    public void addVertex(int v) {
        if (v >= adjacencyList.size()) {
            for (int i = adjacencyList.size(); i <= v; i++) {
                adjacencyList.add(new ArrayList<Integer>());
            }
        }
    }

    public void addEdge(int u, int v) {
        addVertex(u);
        addVertex(v);
        adjacencyList.get(u).add(v);
    }

    public ArrayList<Integer> getNeighbors(int v) {
        return adjacencyList.get(v);
    }
}