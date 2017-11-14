package sample.Distribution;

/**
 * Created by alexiaborchgrevink on 11/13/17.
 */
public class Gamma implements Distribution {

    private static Object lock = new Object();
    private int alpha;
    private int nu;

    public Gamma() {

    }

    public Gamma(int alpha, int nu) {
        this.alpha = alpha;
        this.nu = nu;
    }

    public int getalpha() {
        return alpha;
    }

    public void setalpha(int alpha) {
        this.alpha = alpha;
    }

    public int getNu() {
        return nu;
    }

    public void setNu(int nu) {
        this.nu = nu;
    }

    @Override
    public synchronized double calculateServiceTime(double probability) {
        try {
            lock.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        double serviceTime = 0;
        for (int i = 0; i <= alpha; i++) {
            serviceTime += (-1 / nu) * Math.log(1 - probability);
        }
        lock.notifyAll();
        return serviceTime;
    }
}
