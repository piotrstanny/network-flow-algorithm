package networkflowalgorithm;

public class Link {

    // Link once created has constant attributes
    private final int CAPACITY;
    private final Node LINKED_NODE;
    private final Link NEXT_NODE;

    // CONSTRUCTOR
    public Link(Node node, Link next, int capacity) {
        LINKED_NODE = node;
        NEXT_NODE = next;
        this.CAPACITY = capacity;
    }

    // CLASS METHODS
    public int getCapacity() {
        return CAPACITY;
    }

    public Node getLinkedNode() {
        return LINKED_NODE;
    }

    public Link getNextNode() {
        return NEXT_NODE;
    }
}
