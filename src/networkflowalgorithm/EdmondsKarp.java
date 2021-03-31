package networkflowalgorithm;

/*
 * @author Piotr Stanny
 *
 * Algorithm: Edmonds-Karp Max Flow Implementation
 * which is the Ford-Fulkerson Alg + Breadth-First Search Alg
 */

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class EdmondsKarp {

    // ATTRIBUTES
    private boolean[] visited;
    private Edge[] edgeTo;
    private int result = 0;

    // CONSTRUCTOR
    public EdmondsKarp(Digraph digraph) {

        int s = digraph.getSourceVertex();
        int t = digraph.getSinkVertex();

        int minCapacity = 0; // do i need this?
        System.out.println("Does path exist? - " + breadthFirstSearch(digraph, s, t));
    }

    // CLASS METHODS
    public boolean breadthFirstSearch(Digraph digraph, int source, int sink) {

        visited = new boolean[digraph.getSize()];
        edgeTo = new Edge[digraph.getSize()];
        Queue<Integer> queue = new PriorityQueue<>();

        visited[source] = true;
        queue.add(source);
        while (!queue.isEmpty())  {
            int head = queue.remove();
            for (Edge edge : digraph.getVertex(head).getEdges()) {
                int tail = edge.to();
                if (edge.residualCap(tail) > 0 && !visited[tail]) {
                    edgeTo[tail] = edge;
                    visited[tail] = true;
                    queue.add(tail);
                }
            }
        }
        return visited[sink]; // Has augmenting path to sink?
    }

    // CLASS METHODS

    public int getResult() {
        return result;
    }
}
