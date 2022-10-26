import java.util.Random;
import java.util.Scanner;

public class GameCode {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("What is your name?");
        String playerName = scanner.nextLine();

        System.out.printf("How many rounds do you want to play, %s ?%n", playerName);
        int rounds = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < rounds; i++) {
            System.out.printf("Choose your move, %s%n", playerName);
            System.out.println("[1] Rock");
            System.out.println("[2] Paper");
            System.out.println("[3] Scissors");

            String playerMove = scanner.nextLine();
            int playerMoveNum = Integer.parseInt(playerMove);
            if (playerMoveNum > 3){
                System.out.println("Invalid move");
                continue;
            }

            Random random = new Random();
            int randomNumber = random.nextInt(3);

            String computerMove;
            if (randomNumber == 0) {
                computerMove = "Rock";
            } else if (randomNumber == 1) {
                computerMove = "Paper";
            } else {
                computerMove = "Scissors";
            }
            System.out.println("Computer chose: " + computerMove + "!");

            if (playerMove.equals(computerMove)) {
                System.out.println("It's a draw!");
            } else if (playerWins(playerMove, computerMove)) {
                System.out.println(playerName + " wins!");
            } else {
                System.out.println("Computer wins!");
            }

        }

    }

    static boolean playerWins(String playerMove, String computerMove) {
        if (playerMove.equals("1")) {
            return computerMove.equals("Scissors");
        } else if (playerMove.equals("2")) {
            return computerMove.equals("Rock");
        } else {
            return computerMove.equals("Paper");
        }
    }
}
