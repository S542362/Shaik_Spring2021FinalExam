/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question01_Abstract;

import java.util.Scanner;

/**
 *
 * @author Shabnam Shaik
 */
public class BankDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Shabnam Shaik");
        System.out.print("Enter the amount in axis bank: ");
        double axisAmount = scan.nextDouble();
        System.out.print("Enter the amount: ");
        double amount = scan.nextDouble();
        System.out.print("Enter the interest: ");
        double interest = scan.nextDouble();
        System.out.print("Enter the time: ");
        double time = scan.nextDouble();
        System.out.print("Enter the interest in mid west bank: ");
        double midInterest = scan.nextDouble();
        System.out.print("Enter the amount in mid west: ");
        double amountInMid = scan.nextDouble();
        Axis ax = new Axis(axisAmount, amount, interest, time);
        MidWest mid = new MidWest(midInterest, amountInMid, amount, interest, time);
        System.out.println(ax.toString());
        System.out.println(mid.toString());
    }

}
