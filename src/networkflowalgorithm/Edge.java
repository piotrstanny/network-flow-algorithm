package networkflowalgorithm;

/*
 * @author Piotr Stanny
 */

public class Edge {

    // Edge once created has constant attributes
    private final int CAPACITY;
    private final int TAIL_VERTEX;
    private final int HEAD_VERTEX;
    private int flow;
//    private final Edge NEXT_EDGE;

    // CONSTRUCTOR
    public Edge(int head, int tail, int capacity) {
        HEAD_VERTEX = head;
        TAIL_VERTEX = tail;
//        NEXT_EDGE = nextEdge;
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

//    public Edge getNextEdge() {
//        return NEXT_EDGE;
//    }
}
