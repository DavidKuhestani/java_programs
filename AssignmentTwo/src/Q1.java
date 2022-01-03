package question1;
import java.lang.Math;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount of money: ");
        double amount = input.nextDouble();
        System.out.print("Enter an annual percentage rate");
        double annualRate = input.nextDouble();
        System.out.print("How many years do you want to see: ");
        int years = input.nextInt();

        for(int i = 0; i < 30; i++){
            System.out.println(futureValue());

        }



    }
    //Function to return monthlyRate
    public static double monthlyRate(double annualRate){
        return annualRate / 1200;
    }


    public static double futureValue(double amount, double monthlyRate, int years){
        double futureValue = amount * (1 + Math.pow(monthlyRate, (years*12)));
        return futureValue;
    }


}
