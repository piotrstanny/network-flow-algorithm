package networkflowalgorithm;

/*
 * @author Piotr Stanny
 */

public class Edge {

    // Edge attributes
    private final int CAPACITY;
    private final int TAIL_VERTEX;
    private final int HEAD_VERTEX;
    private int flow;

    // CONSTRUCTOR
    public Edge(int head, int tail, int capacity) {
        HEAD_VERTEX = head;
        TAIL_VERTEX = tail;
        this.CAPACITY = capacity;
        flow = 0;
    }

    // CLASS METHODS
    public int getCapacity() {
        return CAPACITY;
    }
    public int getFlow() { return flow; }
    public int getHead() {
        return HEAD_VERTEX;
    }
    public int getTail() {
        return TAIL_VERTEX;
    }
}
