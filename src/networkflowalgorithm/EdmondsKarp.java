package networkflowalgorithm;

/*
 * @author Piotr Stanny
 *
 * Algorithm: Edmonds-Karp Max Flow Implementation
 * which is the Ford-Fulkerson Alg + Breadth-First Search Alg
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class EdmondsKarp {

    // ATTRIBUTES
    private boolean[] visited;
    private Edge[] edgeTo;
    private int result = 0;

    // CONSTRUCTOR
    public EdmondsKarp(Digraph digraph) {

        int s = digraph.getSourceVertex();
        int t = digraph.getSinkVertex();
        int pathNo = 1;

        // As long as there is augmenting path from source to sink
        while (breadthFirstSearch(digraph, s, t)) {
            int minCapacity = Integer.MAX_VALUE;
            // Display current augmenting path
            Stack<Integer> stack = new Stack<>();
            for (int v = t; v != s; v = edgeTo[v].from()) {
                stack.push(edgeTo[v].to());
            }
            System.out.print("Path No. " + pathNo +": (0)");
            pathNo++;
            while (!stack.empty()) {
                System.out.print("->("+stack.pop()+")");
            }
            System.out.println();
            // Find minimum capacity in the path
            for (int v = t; v != s; v = edgeTo[v].from()) {
                minCapacity = Math.min(minCapacity, edgeTo[v].residualCapTo());
            }
            System.out.println("MIN CAPACITY OF THIS PATH: " + minCapacity);
            // Add to the flow
            for (int v = t; v != s; v = edgeTo[v].from()) {
                edgeTo[v].addResidualFlow(minCapacity);
            }
            result += minCapacity;
            System.out.println("Adding flow of "+minCapacity+" to the network...");

            System.out.print("Current state of this path: (0)");
            Stack<Edge> path = new Stack<>();
            for (int v = t; v != s; v = edgeTo[v].from()) {
                path.push(edgeTo[v]);
            }
            while (!path.empty()) {
                Edge e = path.peek();
                System.out.print("-"+e.flow()+"/"+e.capacity()+"->("+e.to()+")");
                path.pop();
            }
            System.out.println("\nCURRENT TOTAL FLOW: " + result);


        }
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

        // Go to Vertex from the queue
        while (!queue.isEmpty())  {
//            System.out.println("\nQueue content: " + queue.toString());

            int head = queue.remove();

//            System.out.println("Removing (" + head + ") from queue..." +
//                            "\nQueue content: " + queue.toString() +
//                            "\n\n======================================" +
//                            "\n | INSIDE VERTEX (" + head+"):");

            // Explore all Edges from this Vertex
            for (Edge edge : digraph.getVertex(head).getEdges()) {
                int tail = edge.to();
//                System.out.println(" | \n | Exploring Edge ("+head+")->("+tail+")...");
                if (edge.residualCapTo() > 0 && !visited[tail]) {
                    edgeTo[tail] = edge;
                    visited[tail] = true;
                    queue.add(tail);

//                    if (tail == sink) {
//                        System.out.println(" | !!! THE SINK (" + tail + ") HAS BEEN REACHED !!!");
//                    }
//                    System.out.println(" | -- Marking Vertex (" + tail + ") as visited..." +
//                                    "\n | -- Adding Vertex (" + tail + ") to the queue...");
                }
//                else if (visited[tail]){
//                    System.out.println(" | -- Vertex ("+tail+") was already visited!");
//                } else {
//                    System.out.println(" | -- Edge ("+head+")->("+tail+") is already FULL!");
//                }
            }
//            System.out.println(" | \n | NO MORE EDGES FROM VERTEX ("+head+")" +
//                            "\n======================================");
        }
        // Has augmenting path to sink?
        System.out.println("\nHAS AUGMENTING PATH? - " + visited[sink]);
        return visited[sink];
    }

    // CLASS METHODS
    public int getResult() {
        return result;
    }
}
