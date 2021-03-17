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
