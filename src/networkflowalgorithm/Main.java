package networkflowalgorithm;

/*
 * @author Piotr Stanny
 */

public class Main {

    public static void main(String[] args) {

        // Start the session
        UserInterface appSession = new UserInterface();
        // Display welcome message
        appSession.welcomeMessage();
        // Load the Main Menu
        String menuChoice = appSession.menuList();
        // Keep running the User's options until q-Quit
        while (!menuChoice.equals("q")) {
            if ("l".equals(menuChoice)) {
                System.out.println("\nLoad network data from .txt file:\n-------------------------");
                appSession.loadOption();
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
