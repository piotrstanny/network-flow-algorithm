package networkflowalgorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        UserInterface appSession = new UserInterface();
        // Display welcome message
        appSession.welcomeMessage();
        // Load the Main Menu
        String menuChoice = appSession.menuList();
        // Run the option that a User have chosen
        while (!menuChoice.equals("q")) {
            if ("l".equals(menuChoice)) {
                System.out.println("\nLoad network data from file:\n-------------------------");
                appSession.loadData();
                menuChoice = appSession.menuList();
            } else {
                System.out.println("\nInvalid input!");
                menuChoice = appSession.menuList();
            }
        }
        // Inform the program is exiting
        System.out.println("\nYour session has ended. Goodbye!");
    }
}
