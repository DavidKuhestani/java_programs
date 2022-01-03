package midtermexam;

import java.util.Scanner;
import java.util.Random;
public class question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Promting the user for input
        System.out.println("Enter a string: ");
        var string = input.nextLine();

        // Calling method to pick a random char in the string from user
        var randomChar = RandomCharFromString(string);

        //Printing the random char
        System.out.println(randomChar);
        input.close();
    }

    // Method to pick and return random char in string
    public static char RandomCharFromString(String text)
    {

        var lengthText = text.length();
        var rand = new Random();

        // Simulate a random index from 0 to (lengthText - 1)
        var randIndex = rand.nextInt(lengthText);

        // Returning the char at random index "randIndex"
        return text.charAt(randIndex);
    }
}
