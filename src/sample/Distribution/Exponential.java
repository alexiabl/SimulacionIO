package sample.Distribution;

/**
 * Created by alexiaborchgrevink on 11/13/17.
 */
public class Exponential implements Distribution {

    private static Object lock = new Object();

    private double nu;

    public Exponential() {

    }

    public Exponential(double nu) {
        this.nu = nu;
    }

    @Override
    public synchronized double calculateServiceTime() {
        return 0;
    }

    public double getNu() {
        return nu;
    }

    public void setNu(double nu) {
        this.nu = nu;
    }

}
