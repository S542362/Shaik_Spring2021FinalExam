/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10_example1;

/**
 *
 * @author Shabnam Shaik
 */
public class infiniteRecursion {

    private double digit1;
    private double digit2;

    public infiniteRecursion(double digit1, double digit2) {
        this.digit1 = digit1;
        this.digit2 = digit2;
    }

    public double getDigit1() {
        return digit1;
    }

    public void setDigit1(double digit1) {
        this.digit1 = digit1;
    }

    public double getDigit2() {
        return digit2;
    }

    public void setDigit2(double digit2) {
        this.digit2 = digit2;
    }

    public double series(int n) {
        if (digit1 == 0 || digit2 == 0) {
            return 0;
        } else {
            return series((int) ((int) Math.log(n) + (Math.pow(-2, (digit1 + digit2)))));
        }

    }

    @Override
    public String toString() {
        return "number1: " + digit1 + "\nnumber2: " + digit2;
    }

}
