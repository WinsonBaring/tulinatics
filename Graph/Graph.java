package Graph;

import java.util.ArrayList;

public abstract class Graph {
    public ArrayList<ArrayList<Integer>> adjacencyList;

    public Graph() {
            adjacencyList = new ArrayList<>();
    }

    abstract void addVertex(int v);
    abstract void addEdge(int u, int v);

    abstract ArrayList<Integer> getNeighbors(int v);
    public void printGraph() {
        for (int i = 0; i < adjacencyList.size(); i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < adjacencyList.get(i).size(); j++) {
                System.out.print(adjacencyList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

}
