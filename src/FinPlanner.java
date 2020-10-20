/*
/*
  CANER FILIZ
  10/16/2020
  CIS163AA
  This program calculates an investment value for 15 years using a declared values in a for loop. 

  Test data:
  Input:                  Output:  11051,25                 Passed? Y
                                   33016,00                         Y

*/

import java.util.Scanner;

public class FinPlanner {

    public static void main(String[] args) {
        //Declaring the values to be invested, and annual date of return
        final int annualDepositAmount = 500;
        int initialInvestmentAmount = 10000;
        double interestRate = 5.25;
        double compoundInterest = 0.0;
        double yearlyTotalAmount = initialInvestmentAmount + annualDepositAmount;


        Scanner i = new Scanner(System.in);

        //prompting the user to enter the initial amount for investment
        System.out.print("Enter the initial Investment Amount : ");
        initialInvestmentAmount = i.nextInt();

        //prompting the user to enter the interest rate
        System.out.print("Enter the Interest Rate : ");
        interestRate = i.nextDouble();

        //Print statement for headline
        System.out.println("*************************************");
        System.out.println("15-Year Investment Plan");
        System.out.println("*************************************");

        //print statements for initial amount to be invested, the annual rate of interest and the annual amount to be deposited
        System.out.println("Initial Investment:     " + "$" + initialInvestmentAmount);
        System.out.println("Annual Return Rate:     " + "%" + interestRate);
        System.out.println("Annual Deposit Amount:  " + "$" + annualDepositAmount);


        //print statement for headlines "year" and "Investment Value" 
        System.out.println("*************************************");
        System.out.println("Year" + "\t" + "Investment Value \n");

        /*using the for loop to declare the year,
        time period and calculation of initial investment amount,
        annual rate of return and the annual deposit amount.
        */
        for (int timePeriod = 1; timePeriod <= 15; timePeriod++) {
            compoundInterest = yearlyTotalAmount * (interestRate / 100) + yearlyTotalAmount;

            String strDouble = String.format("%.2f", compoundInterest);

            System.out.println(timePeriod + "\t\t" + "$" + strDouble);
            //compoundInterest = newCompoundInterest-annualDepositAmount;
            yearlyTotalAmount = +compoundInterest + annualDepositAmount;
        }

    }


}