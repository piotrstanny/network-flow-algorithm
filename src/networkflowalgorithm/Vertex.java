package networkflowalgorithm;

/*
 * @author Piotr Stanny
 */

import java.util.ArrayList;

public class Vertex {

    private final int VERTEX_NUMBER;
//    private Edge edge;
    private final ArrayList<Edge> setOfEdges;


    // CONSTRUCTOR
    public Vertex(int vertexNumber) {
        this.VERTEX_NUMBER = vertexNumber;
        setOfEdges = new ArrayList<>();
    }

    // CLASS METHODS
    public void addLinkedVertex(int head, int tail, int capacity) {
        setOfEdges.add(new Edge(head, tail, capacity));

    }

    public String printAllEdges() {
        if (setOfEdges == null) {
            return "null";
        } else {
            StringBuilder str = new StringBuilder();
            for (Edge edge : setOfEdges) {
                str.append("[").append(edge.getTail()).append(" (").append(edge.getCapacity()).append(")]");
            }
            return str.toString();

//            str.append("[").append(edge.getTail().getVertexNumber()).append(" (").append(edge.getCapacity()).append(")]");
//            while (edge.getNextEdge() != null) {
//                edge = edge.getNextEdge();
//                str.append(" -> ");
//                str.append("[").append(edge.getTail().getVertexNumber()).append(" (").append(edge.getCapacity()).append(")]");

        }
    }

    public int getVertexNumber() {
        return VERTEX_NUMBER;
    }
}
