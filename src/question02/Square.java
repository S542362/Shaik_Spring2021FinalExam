/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question02;

/**
 *
 * @author Shabnam Shaik
 */
public class Square extends GeometricObject implements Colorable {

    private double length;

    public Square(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    /**
     *
     */
    @Override
    public void howToColor() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Color all four sides.");
    }

    @Override
    public double area() {
        return length * length;
    }

}
