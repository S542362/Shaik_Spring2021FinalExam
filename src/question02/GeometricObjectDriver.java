/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question02;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Shabnam Shaik
 */
public class GeometricObjectDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GeometricObject[] object = new Square[5];
        GeometricObject one = new Square(2);
        GeometricObject four = new Square(4);
        GeometricObject six = new Square(6);
        GeometricObject eight = new Square(8);
        GeometricObject ten = new Square(10);

        object[0] = one;
        object[1] = four;
        object[2] = six;
        object[3] = eight;
        object[4] = ten;
        System.out.println("Shabnam Shaik");
        for (GeometricObject g : object) {

            System.out.println("Area of the object is: " + g.area());
            if (g instanceof Colorable) {
                Colorable co = (Colorable) g;
                co.howToColor();
            }

        }
    }
}
