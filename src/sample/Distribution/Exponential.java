package sample.Distribution;

/**
 * Created by alexiaborchgrevink on 11/13/17.
 */
public class Exponential implements Distribution {

    private static Object lock = new Object();

    private double rate;

    public Exponential() {

    }

    public Exponential(double nu) {
        this.rate = nu;
    }

    public synchronized double getNu() {
        return rate;
    }

    public synchronized void setNu(double nu) {
        this.rate = nu;
    }

    @Override
    public synchronized double calculateServiceTime(double probability) {
        try {
            lock.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        double serviceTime;
        serviceTime = (-1 / rate) * Math.log(1 - probability);
        lock.notifyAll();
        return serviceTime;
    }

}
