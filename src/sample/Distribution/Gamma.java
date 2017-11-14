package sample.Distribution;

/**
 * Created by alexiaborchgrevink on 11/13/17.
 */
public class Gamma implements Distribution {

    private static Object lock = new Object();
    private int lambda;
    private int nu;

    public Gamma() {

    }

    public Gamma(int lambda, int nu) {
        this.lambda = lambda;
        this.nu = nu;
    }

    public int getLambda() {
        return lambda;
    }

    public void setLambda(int lambda) {
        this.lambda = lambda;
    }

    public int getNu() {
        return nu;
    }

    public void setNu(int nu) {
        this.nu = nu;
    }

    @Override
    public synchronized double calculateServiceTime() {
        return 0;
    }
}
