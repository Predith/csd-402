import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate computer's choice: 1 = Rock, 2 = Paper, 3 = Scissors
        int computerChoice = random.nextInt(3) + 1;

        // Prompt the user
        System.out.println("Welcome to Rock-Paper-Scissors!");
        System.out.println("Enter your choice:");
        System.out.println("1 = Rock");
        System.out.println("2 = Paper");
        System.out.println("3 = Scissors");
        System.out.print("Your choice: ");

        int userChoice = scanner.nextInt();

        // Validate input
        if (userChoice < 1 || userChoice > 3) {
            System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            return;
        }

        // Display choices
        System.out.println("Computer chose: " + getChoiceName(computerChoice));
        System.out.println("You chose: " + getChoiceName(userChoice));

        // Determine the result
        if (userChoice == computerChoice) {
            System.out.println("It's a tie!");
        } else if (
            (userChoice == 1 && computerChoice == 3) ||
            (userChoice == 2 && computerChoice == 1) ||
            (userChoice == 3 && computerChoice == 2)
        ) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }

        scanner.close();
    }

    // Helper method to convert number to name
    public static String getChoiceName(int choice) {
        switch (choice) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "Unknown";
        }
    }
}
