package projectGameAssignment;

import java.util.Random;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class mainMenu{

    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
       HashMap<String, Player> leaderboard = new HashMap<String, Player>();
        ArrayList<Player> players = new ArrayList<Player>();
        while (true) {
            System.out.println("Please choose an option:");
            System.out.println("1. New Player" + "\n" + "2. Quit");
            String input = scanner.nextLine();


            if (input.equals("1")) {
                System.out.println("Please enter a name:");
                String userName = scanner.nextLine();
                players.add( new Player(userName));
                leaderboard.put(userName, new Player(userName));

                System.out.println("Hello " + userName + "." + " Please choose a game, or -1 to quit:");
                System.out.println("1. Rock, Scissors or Paper" + "\n" + "2. Coin Flip");
                String usersGameOption = scanner.nextLine();
                while (true) {

                    if (usersGameOption.equals("2")) {
                        coinFlip(leaderboard, userName);

                    } else if (usersGameOption.equals("1")) {
                        RockPaperScissor(leaderboard, userName);
                    } else if (usersGameOption.equals("-1")) {

                        break;
                    }

                    System.out.println("Hello " + userName + "." + " Please choose a game, or -1 to quit:");

                    usersGameOption = scanner.nextLine();
                    if (usersGameOption.equals("-1")) {
                        break;
                    }
                }


            } else if (input.equals("2")) {
                System.out.println("Player : Points");
                for (int i = 0; i < players.size(); i++) {
                    var playerName = players.get(i).getName();
                    System.out.println(leaderboard.get(playerName).toString());
                }

                System.exit(0);
            }

        }

    }


    static void coinFlip(HashMap <String, Player> leaderboard, String userName){
        int score = 0;
        while (true) {
            System.out.println("Do you choose heads or tails? (heads/tails)");

            String input = scanner.nextLine();
            double randomNumber = Math.random();

            if (input.equals("heads")) {
                if (randomNumber < 0.5) {
                    System.out.println("Coin Toss: Heads. You win!");
                    score++;
                } else {
                    System.out.println("You lose..");
                }
            } else if (input.equals("tails")) {
                if (randomNumber > 0.5) {
                    System.out.println("Coin Toss: Tails. You win!");
                    score++;
                } else {
                    System.out.println("You lose..");
                }
            } else {
                System.out.println("Invalid input.");
            }
            System.out.println("Do you wish to play again? (y/n)");
            String playAgain = scanner.nextLine();

            if (playAgain.equals("n")){
                leaderboard.get(userName).setPoints(score);

                break;
            }

        }

    }

    static void RockPaperScissor(HashMap <String, Player> leaderboard, String userName){
        int score = 0;
        while (true) {
           // Scanner scanner = new Scanner(System.in);
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
                    score++;
                }

            } else if (playerMove.equals("p")) {
                if (compMove.equals("r")) {
                    System.out.println("You win..");
                    score++;
                } else if (compMove.equals("s")) {
                    System.out.println("You lose!");
                }

            } else if (playerMove.equals("s")) {
                if (compMove.equals("p")) {
                    System.out.println("You win!");
                    score++;
                } else if (compMove.equals("r")) {
                    System.out.println("You lose..");
                }
            }
            System.out.println("Do you wish to play again? (y/n)");
            String playAgain = scanner.nextLine();

            if (!playAgain.equals("y")){
                leaderboard.get(userName).setPoints(score);
                break;
            }
           // scanner.close();

        }


    }




}
