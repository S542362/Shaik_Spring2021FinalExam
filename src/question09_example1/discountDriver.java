/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question09_example1;

import java.util.Scanner;

/**
 *
 * @author Shabnam Shaik
 */
public class discountDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Shabnam Shaik");
        System.out.println("Enter percentage");
        double perc = sc.nextDouble();
        try {
            Discount dc = new Discount(perc);
            if (dc.getDiscount() < 0 || dc.getDiscount() > 100) {
                throw new NotValidException("Invalid Discout Percentage");
            }
            if (dc.getDiscount() >= 90 && dc.getDiscount() <= 100) {
                System.out.println("More than 90% ");
            } else if (dc.getDiscount() < 90 && dc.getDiscount() >= 80) {
                System.out.println("More than 80% - 90% ");
            } else if (dc.getDiscount() < 80 && dc.getDiscount() >= 70) {
                System.out.println("More than 70% - 80% ");
            } else {
                System.out.println("Less than 70%");
            }
        } catch (Exception ex) {
            System.out.println("Exception" + ex);
        }
    }

    private static class NotValidException extends Exception {

        public NotValidException() {

        }

        public NotValidException(String msg) {
            super(msg);
        }
    }

}
