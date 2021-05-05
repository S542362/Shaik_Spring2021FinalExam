/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10_example1;

import java.util.Scanner;

/**
 *
 * @author Shabnam Shaik
 */
public class InfiniteDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sha = new Scanner(System.in);
        System.out.println("Shabnam Shaik");
        System.out.print("Enter the first digit: ");
        double digit1 = sha.nextDouble();
        System.out.print("Enter the second digit: ");
        double digit2 = sha.nextDouble();

        try {
            infiniteRecursion inrecurs = new infiniteRecursion(digit1, digit2);

            System.out.println(inrecurs.toString());
            System.out.println(inrecurs.series(3));
        } catch (StackOverflowError st) {
            System.out.println("error due to infinite series");
        }

    }
}
