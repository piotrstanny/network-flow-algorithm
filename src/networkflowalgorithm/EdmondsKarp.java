package networkflowalgorithm;

/*
 * @author Piotr Stanny
 *
 * Algorithm: Edmonds-Karp Max Flow Implementation
 * which is the Ford-Fulkerson Alg + Breadth-First Search Alg
 */

public class EdmondsKarp {

    // ATTRIBUTES
    private boolean[] visited;
    private Edge[] edgeTo;
    private int result = 0;

    // CONSTRUCTOR
    public EdmondsKarp(Digraph digraph) {

        Digraph residualGraph = digraph;

        int minCapacity = 0; // do i need this?
        System.out.println("Does path exist? - " +
                breadthFirstSearch(
                        residualGraph,
                        residualGraph.getSourceVertex(),
                        residualGraph.getSinkVertex()));
    }

    public boolean breadthFirstSearch(Digraph digraph, int source, int sink) {


        return true;
    }

    // CLASS METHODS

    public int getResult() {
        return result;
    }
}
