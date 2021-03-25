package networkflowalgorithm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/*
 * @author Piotr Stanny
 */

public class UserInterface {

    public void welcomeMessage() {
        System.out.println("      Welcome to the NETWORK FLOW SOLVER!\n" +
                "===============================================\n" +
                "This application will allow you to calculate\n" +
                "the maximum flow of the flow network given,\n" +
                "which you can provide with .txt file,\n" +
                "in the ...project/samples/ folder.\n\n" +
                "Press any key to continue...");
    }

    // MAIN MENU METHODS
    public String menuList() {
        System.out.println(
                "\nChoose option from the menu:\n"
                + "-------------------------------\n"
                + "Q:\t Quit program\n"
                + "L:\t Load network data from .txt file\n");
        Scanner sc = new Scanner(System.in);
        // Return option chosen by user
        return sc.nextLine().toLowerCase();
    }

    public void loadOption() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type name of the file: ");
        String fileName = sc.nextLine();
        try {
            loadTxt(fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // APPLICATION METHODS
    private void loadTxt(String fileName) throws Exception {
        try {
            String dirPath = System.getProperty("user.dir");
            String fullPath = dirPath + File.separator + "samples" + File.separator + fileName + ".txt";
            Scanner readFile = new Scanner(new BufferedReader(new FileReader(fullPath)));
            System.out.println("The file being loaded:\n" + fullPath);
            // Create Graph as Adjacency List
            Graph graph = createGraph(readFile);
            // Display Graph as Adjacency List
            if (graph == null) {
                System.out.println("The file is empty!! Try different file.");
            } else {
                graph.printGraph();
            }
//            // Display all Edges for testing purposes
//            Scanner readFileAgain = new Scanner(new BufferedReader(new FileReader(fullPath)));
//            displayEdges(readFileAgain);

            readFile.close();
        }
        catch (FileNotFoundException error) {
            System.out.println("[EXCEPTION ERROR]: File not found!\n");
        }
    }

    private Graph createGraph(Scanner readFile) {
        // Check if file not empty
        if (readFile.hasNext()) {
            final int NO_OF_NODES = Integer.parseInt(readFile.nextLine());
            // Initialize Graph as Adjacency List with instances of its Nodes
            Graph graph = new Graph(NO_OF_NODES);
            System.out.println("... Graph has been created!\n-----------------------------");
            System.out.println("No. of Nodes in this Graph: " + NO_OF_NODES);
            System.out.println("- Source Node: " + graph.getSourceNodeNumber());
            System.out.println("- Target Node: " + graph.getTargetNodeNumber());
            // Add Edges to the Adjacency List
            while (readFile.hasNext()) {
                String line = readFile.nextLine();
                String[] lineArr = line.split(" ");
                graph.addEdge(Integer.parseInt(lineArr[0]), Integer.parseInt(lineArr[1]), Integer.parseInt(lineArr[2]));
            }
            return graph;
        } else {
            return null;
        }
    }

    void displayEdges(Scanner readFile) {
        if (readFile.hasNext()) {
            String noOfNodes = readFile.nextLine();
            System.out.println("\n=============================");
        }
        System.out.println("List of Edges:");
        while (readFile.hasNext()) {
            String line = readFile.nextLine();
            String[] lineArr = line.split(" ");
            System.out.println(lineArr[0] + " -> " + lineArr[1] + ", CAPACITY: " + lineArr[2]);
        }
        System.out.println("=============================");
    }
}
