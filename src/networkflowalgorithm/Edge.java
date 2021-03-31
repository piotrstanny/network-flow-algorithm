package networkflowalgorithm;

/*
 * @author Piotr Stanny
 */

public class Edge {

    // ATTRIBUTES
    private final int CAPACITY;
    private final int HEAD;
    private final int TAIL;
    private int flow;

    // CONSTRUCTOR
    public Edge(int head, int tail, int capacity) {
        HEAD = head;
        TAIL = tail;
        this.CAPACITY = capacity;
        flow = 0;
    }

    // CLASS METHODS
    public int residualCapTo(int vertex) {
        if (vertex == TAIL) {
            return CAPACITY - flow;
        }
        else {
            return flow;
        }
    }

    public int capacity() {
        return CAPACITY;
    }
    public int getFlow() { return flow; }
    public int from() {
        return HEAD;
    }
    public int to() {
        return TAIL;
    }
}
