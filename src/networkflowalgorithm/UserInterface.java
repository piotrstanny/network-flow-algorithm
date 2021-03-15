package networkflowalgorithm;

import java.util.Scanner;

public class UserInterface {

    // Display welcome message
    void welcomeMessage() {
        System.out.println("      Welcome to the NETWORK FLOW SOLVER!\n" +
                "===============================================\n" +
                "This application will allow you to calculate\n" +
                "the maximum flow of the network given,\n" +
                "which you can provide with .txt or .csv file.\n\n" +
                "Press any key to continue...");
    }

    // Main Menu methods
    String menuList() {
        System.out.println(
                "\nChoose option from the menu:\n"
                        + "-------------------------------\n"
                        + "Q:\t Quit program\n"
                        + "L:\t Load network data from file\n");
        Scanner sc = new Scanner(System.in);
        String menuChoice = sc.nextLine().toLowerCase();
        return menuChoice;
    }

    void  loadFile() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type name of the file: ");
        String fileName = sc.nextLine();
        System.out.println("Your file: " + fileName);
    }
}
