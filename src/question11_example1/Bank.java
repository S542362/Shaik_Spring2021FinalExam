/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11_example1;

/**
 *
 * @author Shabnam Shaik
 */
public class Bank {

    private final double amount;
    private final double interest;
    private final double time;

    /**
     *
     * @param amount needed will be given
     * @param interest the rate of interest is given
     * @param time the total time or duration is taken
     */
    public Bank(double amount, double interest, double time) {
        this.amount = amount;
        this.interest = interest;
        this.time = time;
    }

    /**
     *
     * @return will get the ampunt
     */
    public double getAmount() {
        return amount;
    }

    /**
     *
     * @return will set interest
     */

    public double getInterest() {
        return interest;
    }

    /**
     *
     * @return will get the time
     */
    public double getTime() {
        return time;
    }

    /**
     *
     * @return will get the rate of interest
     */
    public double rateOfInterest() {
        return interest / (amount * time);
    }

    /**
     * hashcode is overridden
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 12 * hash + (int) (Double.doubleToLongBits(this.amount) ^ (Double.doubleToLongBits(this.amount) >>> 32));
        hash = 12 * hash + (int) (Double.doubleToLongBits(this.interest) ^ (Double.doubleToLongBits(this.interest) >>> 32));
        hash = 12 * hash + (int) (Double.doubleToLongBits(this.time) ^ (Double.doubleToLongBits(this.time) >>> 32));
        return hash;
    }

    /**
     *
     * @param obj if else statement is given to check the equalto statement
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Bank other = (Bank) obj;
        if (Double.doubleToLongBits(this.amount) != Double.doubleToLongBits(other.amount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.interest) != Double.doubleToLongBits(other.interest)) {
            return false;
        }
        if (Double.doubleToLongBits(this.time) != Double.doubleToLongBits(other.time)) {
            return false;
        }
        return true;
    }

    /**
     *
     * @return toString method is overridden
     */
    @Override
    public String toString() {
        return "amount: " + amount + "\ninterest: " + interest + "\ntime: " + time + "days";
    }

}
