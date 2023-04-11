package n1Singleton;

import java.util.Scanner;

import static n1Singleton.Menu.displayMenu;


public class Main {
    public static void main(String[] args) {
        Undo undo = Undo.getUndoInstance();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Current commands:");
                    undo.getCommands().forEach(x -> System.out.print(x + " "));
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Add new command: ");
                    undo.addCommand(scanner.nextLine());
                    break;
                case 3:
                    System.out.println("Delete a command: ");
                    undo.deleteCommand(scanner.nextLine());
                    break;
                case 0:
                    System.out.println("\nExiting program...\n");
                    break;
                default:
                    // handle invalid input
                    System.out.println("\nInvalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }


}