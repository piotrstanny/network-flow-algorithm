package networkflowalgorithm;

public class Graph {

    private Integer noOfNodes;
    private Integer sourceNodeNumber = 0;
    private Integer targetNodeNumber;
    private NodeFrom[] arrayOfNodesFrom;

    public Graph(Integer noOfNodes) {
        this.noOfNodes = noOfNodes;
        this.targetNodeNumber = noOfNodes - 1;
        arrayOfNodesFrom = new NodeFrom[noOfNodes];

    }
}
