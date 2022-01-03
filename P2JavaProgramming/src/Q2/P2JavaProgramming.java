package Q2;
import java.util.Scanner;
import java.lang.Math;


public class P2JavaProgramming {
    static public void main(String[] args){
        //Prompting user for length of pentagon
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length from the center the pentagon to a vertex (r): ");
        double rValuePentagon = scan.nextDouble();

        //Calculating the length of a side on the Pentagon
        double lengthPentagon = 2 * rValuePentagon * (Math.sin(Math.PI / 5));

        //Calculating the area of the Pentagon
        double areaPentagon = (5 * Math.pow(lengthPentagon, 2)) / (4 * (Math.tan(Math.PI / 5)));
        //Checking if the r value of the Pentagon is larger than 0
        if (rValuePentagon <= 0){
            System.out.println("The R value is < 0");
        }
        else{
            System.out.println("The area of the pentagon is " + areaPentagon);
        }


    }
}
