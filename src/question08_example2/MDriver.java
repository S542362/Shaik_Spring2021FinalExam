/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question08_example2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Shabnam Shaik
 */
public class MDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        try {
            int a[] = new int[5];
            a[6] = 9;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Shabnam Shaik");
            System.out.println(e + "\nArray Index is Out Of Bounds");
        }
    }

}
