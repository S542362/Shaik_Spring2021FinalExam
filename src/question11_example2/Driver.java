/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11_example2;

import java.util.Scanner;

/**
 *
 * @author Shabnam Shaik
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Two Student s1 and s2 are created and declared
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter grade: ");
        String grade = scan.next();
        System.out.print("Enter the class status: ");
        String classStatus = scan.next();
        Student s1 = new Student(grade, classStatus);
        Student s2 = new Student("A", "Graduated");

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        /**
         * if else statement is taken and checks if both are equal and prints
         * the outputs accordingly
         */
        if (s1.hashCode() == s2.hashCode()) {

            if (s1.equals(s2)) {
                System.out.println("Two objects are equal ");
            } else {
                System.out.println("two objects are not equal");
            }

        } else {
            System.out.println("Not equal ");
        }
    }
}
