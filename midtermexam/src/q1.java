package midtermexam;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Promting the user for a string of numbers seperated by spaces
        System.out.println("Enter 10 integer: ");
        String [] values = input.nextLine().split(" ");

        // Converting the array of string to array of int
        var myNum = new int [10];
        for(var i = 0; i < 10; i++)
            myNum[i] = Integer.parseInt(values[i]);

        // Calculating the max number among the integers
        var max = myNum[0];
        for (var k = 1; k < myNum.length; k++)
            if (myNum[k] > max)
                max = myNum[k];

        // Printing normalised numbers
        System.out.println("Normalized numbers: ");
        for (var j = 0; j < myNum.length; j++)
            System.out.println((double)myNum[j] / max);

        input.close();

    }
}