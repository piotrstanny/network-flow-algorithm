package networkflowalgorithm;

public class Link {

    private Integer capacity;
    private Node linkedNode;
    private Link nextNode;

    // CONSTRUCTOR
    public Link(Node node, Link next) {
        linkedNode = node;
        nextNode = next;
    }
}
