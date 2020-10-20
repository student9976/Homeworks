import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        /*
            @author CnR
            Base dinner price is $10.00
            Customer will input dinner price
            Tip rates are fixed to %15, %20, %25
            Tip Calculator shows list of prices and corresponding tip amounts.
            Program will show customer entered dinner price and
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base dinner price: 10.00");
        System.out.println("*******************************************");
        System.out.println("*     Artichoke Grill Tip Calculator      *");
        System.out.println("*******************************************");
        System.out.println("  Price       %15          %20        %25");
        System.out.println("*******************************************");

        double dinnerPrice = scanner.nextDouble(); // Customer input for dinner price
        double[] tips = {0.15, 0.20, 0.25}; // Storing tip rates in array

        for (int i = 0; i < 10; i++) {  //purpose of printing 10 times
            System.out.print("$ " + String.format("%.2f", dinnerPrice));
            for (double tip : tips) { // foreach loop
                System.out.print(" \t" + "$ " + String.format("%5s", String.format("%.2f", dinnerPrice * tip))); // calculating tip amount
            }
            System.out.println();
            dinnerPrice += 10.00; // increasing dinner price
        }
        System.out.println("*******************************************");
    }
}
