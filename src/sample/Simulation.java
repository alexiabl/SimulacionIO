package sample;

import sample.Distribution.Exponential;
import sample.Distribution.Gamma;
import sample.Distribution.Uniform;

import java.util.Random;

/**
 * Created by alexiaborchgrevink on 11/13/17.
 */
public class Simulation {

    private System system;

    public void runSimulation(int nSimulations) {
        Random random = new Random();
        system = new System();
        for (int i = 0; i <= nSimulations; i++) {
            int chooseServer = random.nextInt(4);
            switch (chooseServer) {
                case 1:
                    Gamma gamma1 = new Gamma(7, 3);
                    break;
                case 2:
                    Gamma gamma2 = new Gamma(5, 2);
                    break;
                case 3:
                    Exponential exponential = new Exponential(0.3);
                    break;
                case 4:
                    Uniform uniform = new Uniform(4, 9);
                    break;
            }
        }
    }
}

