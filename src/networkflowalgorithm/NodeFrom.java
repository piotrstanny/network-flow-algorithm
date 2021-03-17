package networkflowalgorithm;

public class NodeFrom {

    private Integer nodeNumber;
    private NodeTo linkedNodes;

    public NodeFrom(Integer nodeNumber) {
        this.nodeNumber = nodeNumber;
        linkedNodes = null;
    }

    @Override
    public String toString() {
        return "NodeFrom{" +
                "nodeNumber=" + nodeNumber +
                "}\n";
    }
}
