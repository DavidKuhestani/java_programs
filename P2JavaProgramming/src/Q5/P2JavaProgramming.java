package Q5;

import java.util.Scanner;


public class P2JavaProgramming {
    static public void main(String[] args) {
        //Prompting user for for coordinates
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);

        if(Character.isLetter(ch)){
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.print(ch + " is a vowel");
                    break;
                default:
                    System.out.print(ch + " is a constant");
            }
        }
        else{
            System.out.print("You did not enter a letter");
        }

    }
}

