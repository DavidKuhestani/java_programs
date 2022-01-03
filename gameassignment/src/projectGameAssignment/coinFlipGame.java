package projectGameAssignment;

import java.util.Scanner;

public class coinFlipGame {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Do you choose heads or tails? (heads/tails)");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            double randomNumber = Math.random();
            if (input.equals("heads")) {
                if (randomNumber < 0.5) {
                    System.out.println("Coin Toss: Heads. You win!");
                } else {
                    System.out.println("You lose..");
                }
            } else if (input.equals("tails")) {
                if (randomNumber > 0.5) {
                    System.out.println("Coin Toss: Tails. You win!");
                } else {
                    System.out.println("You lose..");
                }
            } else {
                System.out.println("Invalid input.");
            }

            System.out.println("Do you wish to play again? (y/n)");
            String playAgain = scanner.nextLine();

            if (!playAgain.equals("y")){
                break;
            }
        }
    }
}
