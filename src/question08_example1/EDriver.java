/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question08_example1;

import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Shabnam Shaik
 */
public class EDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception, IOException {
        // TODO code application logic here

        {

            int x = 10, res;

            int arr[] = {1, 2, 3, 4, 5};

            try {

                res = x / 0;

            } catch (Exception e) {
                System.out.println("Shabnam Shaik");

                System.out.print("Exception found");

            }

            try {

                File file = new File("hi.txt");

                FileReader fr = new FileReader(file);

            } catch (Exception FileNotFoundException) {

                System.out.print("File not found\n");

            }

            try {

                System.out.print(arr[7]);

            } catch (Exception ArrayIndexOutOfBound) {

                System.out.println("You are trying to access an element which does not exist in the array");

            }

        }
    }

}
