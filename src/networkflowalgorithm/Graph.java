package networkflowalgorithm;

import java.util.ArrayList;

public class Graph {

    private Integer noOfNodes;
    private Integer sourceNodeNumber = 0;
    private Integer targetNodeNumber;
    private ArrayList<NodeFrom> listOfNodesFrom;

    public Graph(Integer noOfNodes) {
        this.noOfNodes = noOfNodes;
        this.targetNodeNumber = noOfNodes - 1;
        // Create ArrayList with initial capacity
        listOfNodesFrom = new ArrayList<NodeFrom>(noOfNodes);
        // Add Nodes From i.e. nodes generating flow
        for (int i = 0; i < noOfNodes; i++) {
            listOfNodesFrom.add(new NodeFrom(i));
        }
    }

    public String printGraph() {
        return listOfNodesFrom.toString();
    }
}
