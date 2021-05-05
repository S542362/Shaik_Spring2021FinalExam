/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question01_Abstract;

/**
 *
 * @author Shabnam Shaik
 */
public abstract class Bank {

    private final double amount;
    private final double interest;
    private final double time;

    public Bank(double amount, double interest, double time) {
        this.amount = amount;
        this.interest = interest;
        this.time = time;
    }

    public double getAmount() {
        return amount;
    }

    public double getInterest() {
        return interest;
    }

    public double getTime() {
        return time;
    }

    public double rateOfInterest() {
        return interest / (amount * time);
    }

    /**
     *
     * @return
     */
    public abstract double amountToPay();

    @Override
    public String toString() {
        return "amount: " + amount + "\ninterest: " + interest + "\ntime: " + time + "days";
    }

}
