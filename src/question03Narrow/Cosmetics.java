/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question03Narrow;

/**
 *
 * @author Shabnam Shaik
 */
public class Cosmetics {

    private long inches;
    private int ounces;
    private double cost;

    public Cosmetics(long inches, int ounces, double cost) {
        this.inches = inches;
        this.ounces = ounces;
        this.cost = cost;
    }

    public long getInches() {
        return inches;
    }

    public void setInches(long inches) {
        this.inches = inches;
    }

    public int getOunces() {
        return ounces;
    }

    public void setOunces(int ounces) {
        this.ounces = ounces;
    }

    public double getCost() {
        cost = ounces * 24.3;
        return cost;
    }

    @Override
    public String toString() {
        return "inches=" + inches + ", ounces=" + ounces + ", cost=" + cost;
    }

}
