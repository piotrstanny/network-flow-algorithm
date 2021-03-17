package networkflowalgorithm;

public class Node {

    private int nodeNumber;
    private Link linkedNodes;

    public Node(int nodeNumber) {
        this.nodeNumber = nodeNumber;
        linkedNodes = null;
    }

    public void addLinkedNode(Node linkedNode, int capacity) {
        linkedNodes = new Link(linkedNode, linkedNodes, capacity);
    }

    public int getNodeNumber() {
        return nodeNumber;
    }

    public Link getLinkedNodes() {
        return linkedNodes;
    }
}
