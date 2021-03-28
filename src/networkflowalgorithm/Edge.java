package networkflowalgorithm;

/*
 * @author Piotr Stanny
 */

public class Edge {

    // Link once created has constant attributes
    private final int CAPACITY;
    private final Vertex TAIL_VERTEX;
    private final Edge NEXT_EDGE;

    // CONSTRUCTOR
    public Edge(Vertex tail, Edge nextEdge, int capacity) {
        TAIL_VERTEX = tail;
        NEXT_EDGE = nextEdge;
        this.CAPACITY = capacity;
    }

    // CLASS METHODS
    public int getCapacity() {
        return CAPACITY;
    }

    public Vertex getTailVertex() {
        return TAIL_VERTEX;
    }

    public Edge getNextEdge() {
        return NEXT_EDGE;
    }
}
