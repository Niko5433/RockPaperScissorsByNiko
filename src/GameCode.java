import java.util.Random;
import java.util.Scanner;

public class GameCode {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many rounds would you like to play?");
        int rounds = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < rounds; i++) {
            playRockPaperScissors(scanner);
        }
    }

    static void playRockPaperScissors(Scanner scanner) {
        //input from the user
        System.out.println("Choose: Rock, Paper or Scissors: ");
        String playerMove = scanner.nextLine();

        //random input from computer
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

        //Print results
        if (playerMove.equals(computerMove)) {
            System.out.println("It's a draw!");
        } else if (playerWins(playerMove, computerMove)) {
            System.out.println("Player wins!");
        } else {
            System.out.println("Computer wins!");
        }

    }

    static boolean playerWins(String playerMove, String computerMove) {
        if (playerMove.equals("Rock")) {
            return computerMove.equals("Scissors");
        } else if (playerMove.equals("Paper")) {
            return computerMove.equals("Rock");
        } else {
            return computerMove.equals("Paper");
        }
    }
}