package networkflowalgorithm;

public class Link {

    private int capacity;
    private Node linkedNode;
    private Link nextNode;

    // CONSTRUCTOR
    public Link(Node node, Link next, int capacity) {
        linkedNode = node;
        nextNode = next;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public Node getLinkedNode() {
        return linkedNode;
    }

    public Link getNextNode() {
        return nextNode;
    }
}
