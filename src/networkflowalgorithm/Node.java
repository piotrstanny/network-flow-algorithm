package networkflowalgorithm;

public class Node {

    private final int NODE_NUMBER;
    private Link linkedNodes;

    // CONSTRUCTOR
    public Node(int nodeNumber) {
        this.NODE_NUMBER = nodeNumber;
        linkedNodes = null;
    }

    // CLASS METHODS
    public void addLinkedNode(Node linkedNode, int capacity) {
        linkedNodes = new Link(linkedNode, linkedNodes, capacity);
    }

    public int getNodeNumber() {
        return NODE_NUMBER;
    }

    public String getLinkedNodes() {
        if (linkedNodes == null) {
            return "null";
        } else {
            StringBuilder str = new StringBuilder();
            str.append("[").append(linkedNodes.getLinkedNode().getNodeNumber()).append(" (").append(linkedNodes.getCapacity()).append(")]");
            while (linkedNodes.getNextNode() != null) {
                linkedNodes = linkedNodes.getNextNode();
                str.append(" -> ");
                str.append("[").append(linkedNodes.getLinkedNode().getNodeNumber()).append(" (").append(linkedNodes.getCapacity()).append(")]");
            }
            return str.toString();
        }
    }
}
