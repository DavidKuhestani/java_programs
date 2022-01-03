package Q1;
import java.util.Scanner;

public class P2JavaProgramming {
    public static void main(String[] args){
        //Prompting user for the lenghts of the sides of the triangle
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter one side of the triangle: ");
        int sideOne = scan.nextInt();

        System.out.print("Enter the other side of the triangle: ");
        int sideTwo = scan.nextInt();

        System.out.print("Enter the last side of the triangle: ");
        int sideThree = scan.nextInt();

        //Computing/calculating traingleperimeter
        int trianglePerimeter = sideOne + sideTwo + sideThree;

        //checking of two sides of the perimeter is larger than the last length of the triangle
        if ((sideOne + sideTwo > sideThree) && (sideTwo + sideThree > sideOne) && (sideOne + sideThree > sideTwo)){
            System.out.println("The perimeter of the traingle is: " + trianglePerimeter);
        }

        else{
                System.out.println("Input is invalid. Length of two sides are less than the last side.");
        }
    }
}
