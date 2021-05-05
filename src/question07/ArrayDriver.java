/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question07;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Shabnam Shaik
 */
public class ArrayDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rd = new Random();
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt();
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("SHABNAM SHAIK");
        System.out.println("enter the index of the array ");
        int userInput = scan.nextInt();
        if (userInput >= 0 && userInput < 100) {
            System.out.println("Value at corresponding element " + userInput + " is: " + arr[userInput]);
        } else {
            System.out.println("Out of Bounds");
        }
        scan.close();
    }

}
