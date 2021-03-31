package networkflowalgorithm;

/*
 * @author Piotr Stanny
 */

public class Edge {

    // ATTRIBUTES
    private final int CAPACITY;
    private final int FROM_VERTEX;
    private final int TO_VERTEX;
    private int flow;

    // CONSTRUCTOR
    public Edge(int head, int tail, int capacity) {
        FROM_VERTEX = head;
        TO_VERTEX = tail;
        this.CAPACITY = capacity;
        flow = 0;
    }

    // CLASS METHODS
    public int capacity() {
        return CAPACITY;
    }
    public int getFlow() { return flow; }
    public int from() {
        return FROM_VERTEX;
    }
    public int to() {
        return TO_VERTEX;
    }
}
