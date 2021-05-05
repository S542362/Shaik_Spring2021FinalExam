/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question01_Interface;

/**
 *
 * @author Shabnam Shaik
 */
public class Biryani implements Time, Servings {

    private final String dish;
    private final double investment;
    private final double profit;

    public Biryani(String dish, double investment, double profit) {
        this.dish = dish;
        this.investment = investment;
        this.profit = profit;
    }

    public String getDish() {
        return dish;
    }

    public double getInvestment() {
        return investment;
    }

    public double getProfit() {
        return profit;
    }

    public double moneyRecovered() {
        return profit - investment;
    }

    @Override
    public String timetaken() {
        String str = " ";
        if (dish.equals("mutton")) {
            str = "time taken is 30minutes";
        }
        if (dish.equals("chicken")) {
            str = "time taken is 20minutes";
        } else if (dish.equals("panneer")) {
            str = "time taken is 10minutes";

        }
        return str;
    }

    /**
     *
     * @return
     */
    @Override
    public String servesperhead() {
        String str = " ";
        if (dish.equals("mutton")) {
            str = ("servings are 1");
        }
        if (dish.equals("chicken")) {
            str = ("servings are 2");
        }
        if (dish.equals("panneer")) {
            str = ("servings are 3");

        }
        return str;
    }

    /**
     *
     * @param sh
     * @return
     */
    @Override
    public double String(String sh) {
        System.out.print("Using string index method: ");
        int str = (sh.indexOf("b"));
        return str;
    }

    /**
     *
     * @param name
     * @return
     */
    @Override
    public String myst(String name) {
        System.out.print("Using string sub string method: ");
        String str = name.substring(3);
        return str;
    }

    @Override
    public String toString() {
        return "dish: " + dish + "\ninvestment: " + investment + "\nprofit: " + profit
                + "\ntime taken: " + timetaken() + "\nserves per head()" + servesperhead();

    }

}
