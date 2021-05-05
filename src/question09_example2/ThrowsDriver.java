/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question09_example2;

import java.util.Scanner;

/**
 *
 * @author Shabnam Shaik
 */
public class ThrowsDriver {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Shabnam Shaik");
        System.out.println("Enter a value");
        int a = sc.nextInt();
        System.out.println("Enter b Value");
        int b = sc.nextInt();
        if (b == 0) {
            try {
                throw new ArithmeticException("b value cannot be 0");

            } catch (ArithmeticException ex) {
                System.out.println("Exception:" + ex);
            }
        } else {
            System.out.println("Multiplication:" + (a * b));
        }
    }

}
