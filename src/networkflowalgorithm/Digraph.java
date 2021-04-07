package networkflowalgorithm;

/*
 * @author Piotr Stanny - w1729221
 */

import java.util.ArrayList;

public class Digraph {

    // ATTRIBUTES
    private final int SINK_VERTEX;
    private final int SOURCE_VERTEX = 0;
    private final ArrayList<Vertex> setOfVertices;
    private int NO_OF_EDGES = 0;

    // CONSTRUCTOR
    public Digraph(int noOfVertices) {
        this.SINK_VERTEX = noOfVertices - 1;
        // Create ArrayList with initialCapacity equal to noOfVertices
        setOfVertices = new ArrayList<Vertex>(noOfVertices);
        // Create instances of Vertices in the list
        for (int i = 0; i < noOfVertices; i++) {
            setOfVertices.add(new Vertex(i));
        }
    }

    // CLASS METHODS
    public void addEdge(int head, int tail, int capacity) {
        setOfVertices.get(head).addLinkedVertex(head, tail, capacity);
    }

    public void printDigraph() {
        System.out.println("\nDigraph representation as Adjacency List:\n" +
                            "==========================================");
        for (Vertex vertex : setOfVertices) {
            System.out.println("Vertex: [" + vertex.getVertexNumber() + "]" + vertex.printAllEdges());
        }
        System.out.println("==========================================");
    }

    public void resetFlows() {
        for (Vertex v : setOfVertices) {
            for (Edge e : v.getEdges()) {
                e.resetFlow();
            }
        }
    };

    public void edgeCount() {
        NO_OF_EDGES++;
    }

    public int getSinkVertex() {
        return SINK_VERTEX;
    }
    public int getSourceVertex() {
        return SOURCE_VERTEX;
    }
    public int getSize() {
        return setOfVertices.size();
    }
    public Vertex getVertex(int v) {
        return setOfVertices.get(v);
    }
    public int getNoOfEdges() {
        return NO_OF_EDGES;
    }
}
