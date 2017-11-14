package sample.Distribution;

/**
 * Created by alexiaborchgrevink on 11/13/17.
 */
public class Uniform implements Distribution {

    private static Object lock = new Object();
    private int a;
    private int b;

    public Uniform() {

    }

    public Uniform(int a, int b) {
        this.a = a;
        this.b = b;
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public synchronized double calculateServiceTime(double probability) {
        try {
            lock.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        double serviceTime;
        serviceTime = a + (b - a) * probability;
        lock.notifyAll();
        return serviceTime;
    }
}
