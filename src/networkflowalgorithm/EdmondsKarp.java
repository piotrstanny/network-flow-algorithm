package networkflowalgorithm;

/*
 * @author Piotr Stanny
 *
 * Algorithm: Edmonds-Karp Max Flow Implementation
 * which is the Ford-Fulkerson Alg + Breadth-First Search Alg
 */

import java.util.LinkedList;
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
        System.out.println("Does path to sink exist? - " + breadthFirstSearch(digraph, s, t));
    }

    // CLASS METHODS
    public boolean breadthFirstSearch(Digraph digraph, int source, int sink) {

        // Initialize variables
        visited = new boolean[digraph.getSize()];
        edgeTo = new Edge[digraph.getSize()];
        Queue<Integer> queue = new LinkedList<>();

        // Begin with source Vertex
        visited[source] = true;
        queue.add(source);
        System.out.println("\nMarking Vertex (" + source + ") as visited..." +
                        "\nAdding Vertex (" + source + ") to queue...");

        // Go to Vertex from the queue
        while (!queue.isEmpty())  {
            System.out.println("Queue content: " + queue.toString());

            int head = queue.remove();

            System.out.println("Removing (" + head + ") from queue..." +
                            "\nQueue content: " + queue.toString() +
                            "\n\n======================================" +
                            "\n | Inside Vertex (" + head+"):");
            // Explore all Edges from this Vertex
            for (Edge edge : digraph.getVertex(head).getEdges()) {
                int tail = edge.to();
                System.out.println(" | \n | Exploring Edge ("+head+")->("+tail+")...");
                if (edge.residualCapTo(tail) > 0 && !visited[tail]) {
                    edgeTo[tail] = edge;
                    visited[tail] = true;
                    queue.add(tail);

                    if (tail == sink) {
                        System.out.println(" | !!! THE SINK (" + tail + ") HAS BEEN REACHED !!!");
                    }
                    System.out.println(" | -- Marking Vertex (" + tail + ") as visited..." +
                                    "\n | -- Adding Vertex (" + tail + ") to the queue...");
                } else {
                    System.out.println(" | -- Vertex ("+tail+") was already visited!");
                }
            }
            System.out.println(" | \n | NO MORE EDGES FROM VERTEX ("+head+")" +
                            "\n======================================\n");
        }
        // Has augmenting path to sink?
        return visited[sink];
    }

    // CLASS METHODS
    public int getResult() {
        return result;
    }
}
