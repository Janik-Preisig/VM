package wiss.m165.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class UserMenu {

    private static Scanner scanner = new Scanner(System.in);
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void displayOptions() throws IOException {
        System.out.println("""
                    What would you like to do?
                    1: List all games
                    2: List all reviews
                    3: List all reviews for a single game
                    4: Add a review to a game
                    0: Quit / Exit
                """);
        System.out.print("-> ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                listGames();
                System.out.println("");
                displayOptions();
                break;
            case 2:
                listAllReviews();
                System.out.println("");
                displayOptions();
                break;
            case 3:
                listReviewsForGame();
                System.out.println("");
                displayOptions();
                break;
            case 4:
                addReviewToGame();
                System.out.println("");
                displayOptions();
                break;
            case 0:
                break;
            default:
                System.out.println("This option is not supported!");
                System.out.println("");
                displayOptions();
                break;
        }
    }

    /**
     * Lists all the games from the database and asks the user to provide a name, as
     * well as feedback and points to add a new review for a specific game.
     * 
     * @throws IOException
     */
    private void addReviewToGame() throws IOException {
        System.out.println("The following games are available for review:");
        listGames();

        System.out.print("Name the game for reviewing: ");
        String gameName = reader.readLine();

        System.out.print("What feedback do you want to give: ");
        String feedback = reader.readLine();

        System.out.print("How many points (out of 100) would you give '" + gameName + "': ");
        int points = scanner.nextInt();

        // TODO: implement adding review to a game
    }

    /**
     * Lists all the games from the database and asks the user to provide a name so
     * all corresponding reviews are displayed in the console.
     * 
     * @throws IOException
     */
    private void listReviewsForGame() throws IOException {
        System.out.println("The following games are available for review:");
        listGames();

        System.out.print("For which game would you like to see the reviews: ");
        String gameName = reader.readLine();

        // TODO: implement finding reviews for games and print them
    }

    /**
     * Retrieves all reviews for all games and prints them to the console.
     */
    private void listAllReviews() {
        // TODO: implement loading all reviews and print them
    }

    /**
     * Retrieves all the games from the database and prints them to the console.
     */
    private void listGames() {
        // TODO: implement loading all games and print them
    }
}
