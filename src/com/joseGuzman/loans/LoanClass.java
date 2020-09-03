package com.joseGuzman.loans;
/* Name: Jose Guzman
 * Date: 9/1/2020
 * Project Title: Loans
 */
import java.util.Scanner;
import java.math.*;

public class LoanClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyIn = new Scanner(System.in);
		   double principal, interest, payment;
		   int length;
		   /* get all input from the user after creating a Scanner object for input.
		    * use the formula and output the payment.
		    */
		   System.out.print("Please enter the principal of the loan: ");
		   principal = keyIn.nextDouble();
		   System.out.printf("%n %s", "Please enter the interest rate in a percentage: ");
		   interest = keyIn.nextDouble();
		   double monthlyRate = interest / 12.0;
		   System.out.printf("%n %s", "Please enter the length of the loan in years: ");
		   length = keyIn.nextInt();
		   int months = length * 12;
		   payment = (principal * monthlyRate) / (1-Math.pow(1+monthlyRate, - months));
		   System.out.printf("%n %s", "Your monthly payment is: $");
		   String str = String.format("%.02f", payment);
		   System.out.print(str);

	}

}
