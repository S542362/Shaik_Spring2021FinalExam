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
public class MidWest extends Bank {

    private final double midInterest;
    private final double amountInMid;

    public MidWest(double midInterest, double amountInMid, double amount, double interest, double time) {
        super(amount, interest, time);
        this.midInterest = midInterest;
        this.amountInMid = amountInMid;
    }

    public double getMidInterest() {
        return midInterest;
    }

    public double getAmountInMid() {
        return amountInMid;
    }

    /**
     *
     * @return
     */
    @Override
    public double rateOfInterest() {
        return midInterest / (amountInMid * super.getTime());

    }

    /**
     *
     * @return
     */
    @Override
    public double amountToPay() {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return amountInMid + midInterest;
    }

    @Override
    public String toString() {
        return "midInterest: " + midInterest + "\namountInMid: " + "\namount to pay: " + amountToPay()
                + "\n" + super.toString();
    }

}
