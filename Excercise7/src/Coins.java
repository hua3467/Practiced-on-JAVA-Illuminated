/**
 * 7.18 Exercises, Problem 66
 * @author  ZhenhuaYang
 */

import java.text.DecimalFormat;

/**
 * Represents a collection of coins, including some quarters, dimes, nickels and pennies.
 */
public class Coins {
    /**
     * instance variables saving the number of quarters, dimes, nickels and pennies.
     */
    private int quarter;
    private int dime;
    private int nickel;
    private int penny;

    //the total dollars in this collection.
    private double totalDollar;

    //create a DecimalFormat object to convert the amount of money to US dollar with two decimal value.
    DecimalFormat toDollar = new DecimalFormat("$0.00");

    /**
     * Create a new Coins object with the given number of coins in each type.
     * @param q This is the number of quarters entered by user.
     * @param d This is the number of dimes entered by user.
     * @param n This is the number of nickels entered by user.
     * @param p This is the number of pennies entered by user.
     */
    public Coins( int q, int d, int n, int p ){
        quarter = q;
        dime = d;
        nickel = n;
        penny = p;
    }

    public int getQuarter(){
        return quarter;
    }
    public int getDime(){
        return dime;
    }
    public int getNickel(){
        return nickel;
    }
    public int getPenny(){
        return penny;
    }

    /**
     * Update the number of quarters in this object
     * @param q This new number of quarters.
     */
    public void setQuarter( int q){
        quarter = q;
    }

    /**
     *
     * @param d
     */
    public void setDime( int d ){
        dime = d;
    }

    /**
     *
     * @param n
     */
    public void setNickel( int n ){
        nickel = n;
    }

    /**
     *
     * @param p
     */
    public void setPenny( int p ){
        penny = p;
    }

    /**
     * Calculate the total amount of money
     * @return  total amount of money in dollar notation with two significant digits
     */
    public String totalDollar(){

        totalDollar = quarter * 0.25 + dime * 0.1 + nickel * 0.05 + penny * 0.01;
        return toDollar.format( totalDollar );
    }

    public String moneyQuarter(){
        return toDollar.format(quarter * .25);
    }
    public String moneyDime(){
        return toDollar.format(dime * .10);
    }
    public String moneyNickel(){
        return toDollar.format(nickel * .05);
    }
    public String moneyPenny(){
        return toDollar.format(penny * .01);
    }

    /**
     *
     * @return
     */
    public String toString(){
        return "Total amount: " + totalDollar()
                + "\nNumber of quarters: " + getQuarter() + ", equals " + moneyQuarter()
                + "\nNumber of dimes: " + getDime() + ", equals " + moneyDime()
                + "\nNumber of nickels: " + getNickel() + ", equals " + moneyNickel()
                + "\nNumber of pennies: " + getPenny() + ", equals " + moneyPenny();
    }

    @Override
    public boolean equals(Object obj) {
        if( ! ( obj instanceof Coins ) )
            return false;
        else{
            Coins objCoins = (Coins) obj;
            return quarter == objCoins.quarter && dime == objCoins.dime
                    && nickel == objCoins.nickel && penny == objCoins.penny;
        }
    }
}

