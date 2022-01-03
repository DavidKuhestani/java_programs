package projectGameAssignment;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {

public static void main(String[] args) {
    //public int rpsGame ( int inputFromUser){
    Scanner scanner = new Scanner(System.in);
    while (true) {
        String[] rps = {"r", "p", "s"};
        String compMove = rps[new Random().nextInt(rps.length)];

        String playerMove;

        while (true) {
            System.out.println("Please enter your move (r for Rock, p for Paper or s for Scissors):");
            playerMove = scanner.nextLine();
            if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                break;
            }
            System.out.println(playerMove + " is not valid");
        }
        System.out.println("Computer played: " + compMove);

        if (playerMove.equals(compMove)) {
            System.out.println("The game was a tie");
        } else if (playerMove.equals("r")) {
            if (compMove.equals("p")) {
                System.out.println("You lose..");
            } else if (compMove.equals("s")) {
                System.out.println("You win!");
            }

        } else if (playerMove.equals("p")) {
            if (compMove.equals("r")) {
                System.out.println("You win..");
            } else if (compMove.equals("s")) {
                System.out.println("You lose!");
            }

        } else if (playerMove.equals("s")) {
            if (compMove.equals("p")) {
                System.out.println("You win!");
            } else if (compMove.equals("r")) {
                System.out.println("You lose..");
            }
        }
        System.out.println("Do you wish to play again? (y/n)");
        String playAgain = scanner.nextLine();

        if (!playAgain.equals("y")){
            break;
        }

    }
    scanner.close();
}
}
