package networkflowalgorithm;

public class Node {

    private Integer nodeNumber;
    private Link linkedNodes;

    public Node(Integer nodeNumber) {
        this.nodeNumber = nodeNumber;
        linkedNodes = null;
    }

    public void addLinkedNode(Node linkedNode) {
        linkedNodes = new Link(linkedNode, linkedNodes);
    }

    public Integer getNodeNumber() {
        return nodeNumber;
    }

    public Link getLinkedNodes() {
        return linkedNodes;
    }
}
