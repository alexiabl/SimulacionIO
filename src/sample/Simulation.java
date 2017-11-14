package sample;

import sample.Distribution.Exponential;
import sample.Distribution.Gamma;
import sample.Distribution.Uniform;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by alexiaborchgrevink on 11/13/17.
 */
public class Simulation {

    private System system;
    private Timer timer;


    public void runSimulation(int nSimulations) {
        Random random = new Random();
        system = new System();
        for (int i = 0; i <= nSimulations; i++) {
            int chooseServer = random.nextInt(4);
            double serviceProbability = random.nextInt(1);
            double arrivalProbability = random.nextInt(1);

            switch (chooseServer) {
                case 1:
                    Gamma gamma1 = new Gamma(7, 3);

                    //job.run();
                    break;
                case 2:
                    Gamma gamma2 = new Gamma(5, 2);
                    double gamma2ServiceTime = gamma2.calculateServiceTime(serviceProbability);
                    break;
                case 3:
                    Exponential exponential = new Exponential(0.3);
                    double expServiceTime = exponential.calculateServiceTime(serviceProbability);
                    break;
                case 4:
                    Uniform uniform = new Uniform(4, 9);
                    double uniformServiceTime = uniform.calculateServiceTime(serviceProbability);
                    break;
            }
        }
    }

    public Job dispatchJob(double arrivalProbability) {
        Exponential exponential = new Exponential(30);
        long interArrivalTime = (long) exponential.calculateServiceTime(arrivalProbability);
        Timer timer = new Timer();
        return null;
    }

}

