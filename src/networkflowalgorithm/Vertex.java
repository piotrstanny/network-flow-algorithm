package networkflowalgorithm;

/*
 * @author Piotr Stanny
 */

public class Vertex {

    private final int VERTEX_NUMBER;
    private Edge edge;

    // CONSTRUCTOR
    public Vertex(int vertexNumber) {
        this.VERTEX_NUMBER = vertexNumber;
        edge = null;
    }

    // CLASS METHODS
    public void addLinkedVertex(Vertex tail, int capacity) {
        edge = new Edge(tail, edge, capacity);
    }

    public String printEdges() {
        if (edge == null) {
            return "null";
        } else {
            StringBuilder str = new StringBuilder();
            str.append("[").append(edge.getTailVertex().getVertexNumber()).append(" (").append(edge.getCapacity()).append(")]");
            while (edge.getNextEdge() != null) {
                edge = edge.getNextEdge();
                str.append(" -> ");
                str.append("[").append(edge.getTailVertex().getVertexNumber()).append(" (").append(edge.getCapacity()).append(")]");
            }
            return str.toString();
        }
    }

    public int getVertexNumber() {
        return VERTEX_NUMBER;
    }
}
