package networkflowalgorithm;

public class NodeFrom {

    private Integer nodeNumber;
    private NodeTo linkedNodes;

    public NodeFrom(Integer nodeNumber) {
        this.nodeNumber = nodeNumber;
        linkedNodes = null;
    }

    public Integer getNodeNumber() {
        return nodeNumber;
    }

    public NodeTo getLinkedNodes() {
        return linkedNodes;
    }
}
