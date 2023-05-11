package Graph;

import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Choose graph (1 - Directed, 2 - Undirected): ");
        int graph_type = input.nextInt();

        if(graph_type == 1) {
             var someGraph = new DirectedGraph();
            Tester.test(someGraph);
        } else {
             var someGraph = new UndirectedGraph();
            Tester.test(someGraph);
        }
    }
}