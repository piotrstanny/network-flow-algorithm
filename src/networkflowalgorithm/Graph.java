package networkflowalgorithm;

import java.util.ArrayList;

public class Graph {

    // ATTRIBUTES
    private Integer noOfNodes;
    private Integer sourceNodeNumber = 0;
    private Integer targetNodeNumber;
    private ArrayList<Node> listOfNodes;

    // CONSTRUCTOR
    public Graph(Integer noOfNodes) {
        this.noOfNodes = noOfNodes;
        this.targetNodeNumber = noOfNodes - 1;
        // Create ArrayList with initial capacity
        listOfNodes = new ArrayList<Node>(noOfNodes);
        // Create instances of Nodes in the list
        for (int i = 0; i < noOfNodes; i++) {
            listOfNodes.add(new Node(i));
        }
    }

    // CLASS METHODS
    public void addEdge(Integer from, Integer to) {
        listOfNodes.get(from).addLinkedNode(listOfNodes.get(to));
    }

    public void printGraph() {
        for (Node node : listOfNodes) {
            System.out.println("Head Vertex: [" + node.getNodeNumber() + "] -> Linked Nodes: " + node.getLinkedNodes());
        }
    }
}
