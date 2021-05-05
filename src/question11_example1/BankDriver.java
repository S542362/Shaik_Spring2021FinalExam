/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11_example1;

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
        /**
         * amount ,interest ,time for three banks are given
         */
        Bank b1 = new Bank(54.5, 16.7, 10);
        Bank b2 = new Bank(54.5, 16.7, 10);
        Bank b3 = new Bank(17.9, 21.3, 27.6);
        System.out.println("Shabnam Shaik");
        /**
         * *
         * all the values are called by the to.string
         */
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString());
        System.out.println("rate of interest is: " + b1.rateOfInterest());
        System.out.println("rate of interest is: " + b2.rateOfInterest());
        System.out.println("rate of interest is: " + b3.rateOfInterest());

        System.out.println("-----------------------------");
        System.out.println(b1.equals(b3));
        System.out.println(b2.equals(b3));
        System.out.println(b2.equals(b1));
        System.out.println("------------------------------");

        System.out.println(b1 == b3);
        System.out.println(b2 == b3);
        System.out.println(b1 == b2);

        System.out.println("--------------------------");
        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());
        System.out.println(b3.hashCode());

    }

}
