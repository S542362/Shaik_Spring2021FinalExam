/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question06_unchecked;

import java.util.Scanner;

/**
 *
 * @author Shabnam Shaik
 */
public class PersonDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IllegalArgumentException {
        // TODO code application logic here

        Scanner scan = new Scanner(System.in);
        System.out.println("Shabnam Shaik");
        System.out.print("Enter the name: ");
        String name = scan.next();
        try {
            System.out.print("Enter the age: ");

            int age = scan.nextInt();

            Person per = new Person(name, age);
            System.out.println(per.toString());
            System.out.println(per.age());

        } catch (Exception e) {

            System.out.println("exception thrown");

        }
    }
}
