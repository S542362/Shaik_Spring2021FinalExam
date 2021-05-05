/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question06_checked;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Shabnam Shaik
 */
public class TrainDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here

        Scanner scan = new Scanner(new File("input.txt"));
        System.out.println("Shabnam Shaik");
        int compartments = scan.nextInt();

        String name = scan.next();

        try {
            Train train = new Train(compartments, name);
            System.out.println(train.toString());

        } catch (Exception e) {
            System.out.println("file is not found");
        }
    }

}
