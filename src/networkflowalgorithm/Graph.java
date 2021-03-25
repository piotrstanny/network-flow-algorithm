package networkflowalgorithm;

import java.util.ArrayList;

/*
 * @author Piotr Stanny
 */

public class Graph {

    private final int TARGET_NODE_NUMBER;
    private ArrayList<Node> listOfNodes;

    // CONSTRUCTOR
    public Graph(int noOfNodes) {
        this.TARGET_NODE_NUMBER = noOfNodes - 1;
        // Create ArrayList with initial capacity
        listOfNodes = new ArrayList<Node>(noOfNodes);
        // Create instances of Nodes in the list
        for (int i = 0; i < noOfNodes; i++) {
            listOfNodes.add(new Node(i));
        }
    }

    // CLASS METHODS
    public void addEdge(int from, int to, int capacity) {
        listOfNodes.get(from).addLinkedNode(listOfNodes.get(to), capacity);
    }

    public void printGraph() {
        System.out.println("=======================================\nGraph representation as Adjacency List:\n");
        for (Node node : listOfNodes) {
            System.out.println("Node: [" + node.getNodeNumber() + "] -> " + node.getLinkedNodes());
        }
        System.out.println("=======================================");
    }

    public int getTargetNodeNumber() {
        return TARGET_NODE_NUMBER;
    }

    public int getSourceNodeNumber() {
        return 0;
    }
}
