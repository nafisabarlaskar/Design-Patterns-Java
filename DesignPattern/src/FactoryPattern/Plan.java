package FactoryPattern;

/**
 * Created by NafisaBarlaskar on 07-02-2017.
 */
public abstract class Plan {

    protected double rate;
    abstract double getRate();

    public double calculateBill(int units, double rate){
        return (units*rate);
    }
}
