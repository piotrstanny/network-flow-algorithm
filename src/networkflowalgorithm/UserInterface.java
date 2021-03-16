package networkflowalgorithm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class UserInterface {

    // Display welcome message
    public void welcomeMessage() {
        System.out.println("      Welcome to the NETWORK FLOW SOLVER!\n" +
                "===============================================\n" +
                "This application will allow you to calculate\n" +
                "the maximum flow of the network given,\n" +
                "which you can provide with .txt or .csv file.\n\n" +
                "Press any key to continue...");
    }

    // Main Menu methods
    public String menuList() {
        System.out.println(
                "\nChoose option from the menu:\n"
                        + "-------------------------------\n"
                        + "Q:\t Quit program\n"
                        + "L:\t Load network data from file\n");
        Scanner sc = new Scanner(System.in);
        String menuChoice = sc.nextLine().toLowerCase();
        return menuChoice;
    }

    public void loadData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type name of the file: ");
        String fileName = sc.nextLine();
//        System.out.println("Your file: " + fileName);
        try {
            loadFile(fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // User Interface methods
    void loadFile( String fileName) throws Exception {
        try {
            String dirPath = System.getProperty("user.dir");
            String fullPath = dirPath + File.separator + "samples" + File.separator + fileName;
            Scanner readFile = new Scanner(new BufferedReader(new FileReader(fullPath)));
            System.out.println("The file being loaded:\n" + fullPath);

            if (readFile.hasNext()) {
                String noOfNodes = readFile.nextLine();
                System.out.println("\n=============================");
                System.out.println("No of Nodes in this Graph: " + noOfNodes);
            }
            System.out.println("Content of Edges:");
            while (readFile.hasNext()) {
                String line = readFile.nextLine();
                String[] lineArr = line.split(" ");
                System.out.println(lineArr[0] + " -> " + lineArr[1] + ", CAPACITY: " + lineArr[2]);
            }
            readFile.close();
            System.out.println("=============================");
        }
        catch (FileNotFoundException error) {
            System.out.println("[EXCEPTION ERROR]: File not found!\n");
        }
    }
}
