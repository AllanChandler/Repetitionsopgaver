import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter name: "+"\n");
        String playerName = scanner.nextLine();

        boolean playAgain = true;

        while (playAgain) {
            System.out.print("\n" + playerName + ", Enter move : (stone/scissors/paper) "+"\n");
            String playerMove = scanner.nextLine().toLowerCase();

            int computerMoveInt = random.nextInt(3);
            String computerMove = "";
            switch (computerMoveInt) {
                case 0:
                    computerMove = "stone";
                    break;
                case 1:
                    computerMove = "scissors";
                    break;
                case 2:
                    computerMove = "paper";
                    break;
            }

            System.out.println("\n"+"Player Move: " + playerMove);
            System.out.println("Computer Move: " + computerMove);

            String result = "";
            if (playerMove.equals(computerMove)) {
                result = "Tie";
            } else if ((playerMove.equals("stone") && computerMove.equals("scissors")) ||
                    (playerMove.equals("scissors") && computerMove.equals("paper")) ||
                    (playerMove.equals("paper") && computerMove.equals("stone"))) {
                result = playerName + " won";
            } else {
                result = "Computer won";
            }

            System.out.println("result: " + result);

            System.out.print("\n"+"Do you wish to play again? (yes/no): "+"\n");
            String playAgainInput = scanner.nextLine().toLowerCase();
            playAgain = playAgainInput.equals("yes");
        }

        System.out.println("\n"+"Thanks for playing, " + playerName);
    }
}