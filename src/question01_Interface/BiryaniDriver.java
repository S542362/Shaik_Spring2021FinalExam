/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question01_Interface;

import java.util.Scanner;

/**
 *
 * @author Shabnam Shaik
 */
public class BiryaniDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Shabnam Shaik");
        System.out.print("Enter the dish: ");
        String dish = scan.next();
        System.out.println("cost of dish");
        double cost = scan.nextDouble();

        System.out.print("Enter the investment: ");
        double investment = scan.nextDouble();
        System.out.print("Enter the profit: ");
        double profit = scan.nextDouble();

        Biryani b = new Biryani(dish, investment, profit);
        System.out.println("moneyrecovered: " + b.moneyRecovered());

        System.out.println(b.toString());
        System.out.println("Finding the index");
        System.out.println(b.String("shabnam"));
        System.out.println("substring : ");
        System.out.println(b.myst("shaik"));
    }

}
