/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question03Narrow;

import java.util.Scanner;

/**
 *
 * @author Shabnam Shaik
 */
public class CosmeticsDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        double cost = 76.5;
        long inches = (long) cost;
        int ounces = (int) inches;
        Cosmetics cos = new Cosmetics(inches, ounces, cost);
        System.out.println("Shabnam Shaik");
        System.out.println(cos.toString());

    }
}
