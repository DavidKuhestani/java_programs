package question1;
import java.util.Scanner;
import java.lang.Math;

public class P3JavaProgramming {
    public static void main(String args[]){
        //Scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a credit card number: ");
        long cardNumber = input.nextLong();
        int lengthOfCard = (int)(Math.log10(cardNumber)+1);
        int [] digits = new int[2];

        //checking the length of the card
        if(lengthOfCard >= 13 && lengthOfCard <= 15) {
            long firstDigit = cardNumber;
            while(firstDigit >= 10){
                firstDigit = firstDigit / 10;

            }
            //Storing the value into the Array
            digits[0] = (int)firstDigit;

            System.out.println("First digit: " + firstDigit);

            int[] validPrefix = {4, 5, 6, 37};
            //Checking the last two digits of the card number
            long firstTwoDigits = Long.parseLong(Long.toString(cardNumber).substring(0,2));
            System.out.println(firstTwoDigits);
            //adding it to the array
            digits[1] = (int)firstTwoDigits;

            boolean prefixMatch = false;
           for(int i = 0; i < digits.length; i++){
                 // System.out.println(digits[i]);
                  for(int j = 0; j < validPrefix.length; j++){
                      if(digits[i] == validPrefix[j]){
                          prefixMatch = true;
                      }

                  }
            }
            if(prefixMatch == false) {
                System.out.println("The card is invalid");

            }


        }


        input.close();

    }



}

