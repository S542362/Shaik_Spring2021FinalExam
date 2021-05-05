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
public class Axis extends Bank {

    private final double axisAmount;

    public Axis(double axisAmount, double amount, double interest, double time) {
        super(amount, interest, time);
        this.axisAmount = axisAmount;
    }

    public double getAxisAmount() {
        return axisAmount;
    }

    /**
     *
     * @return
     */
    @Override
    public double rateOfInterest() {
        return super.getInterest() / (axisAmount * super.getTime());
    }

    /**
     *
     * @return
     */
    @Override
    public double amountToPay() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return axisAmount + super.getInterest();

    }

    @Override
    public String toString() {
        return super.toString() + "\naxisAmount: " + axisAmount
                + "\nRate of intererst: " + rateOfInterest()
                + "\namount to pay: " + amountToPay();
    }

}
