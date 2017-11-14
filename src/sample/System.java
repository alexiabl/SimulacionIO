package sample;

import sample.Distribution.Exponential;
import sample.Distribution.Gamma;
import sample.Distribution.Uniform;

import java.time.Duration;
import java.util.Queue;

/**
 * Created by alexiaborchgrevink on 11/13/17.
 */
public class System {

    private Duration waitingTimeForJob;
    private Duration responseTime;
    private double queueLengthJobArrives;
    private Duration waitTime;
    private double queueLength;
    private double probOneServerAvailable;
    private double probTwoServersAvailable;
    private Duration timeServerIdle;
    private double numberJobsRemainingAfter;
    private double numberJobsLeftEarly;
    private double numberJobsByServer;
    private Gamma gamma1;
    private Exponential exponential;
    private Gamma gamma2;
    private Uniform uniform;
    private Queue<Job> waitingQueue;
    private int interarrivalTime = 30;

    public System() {

    }

    public Duration calculateExpWaitingTimeJob() {
        return null;
    }

    public Duration calculateExpResponseTime() {
        return null;
    }

    public double calculateExpQueueLengthOnArrival() {
        return 0;
    }

    public Duration calculateMaxWaitTime() {
        return null;
    }

    public double calculateMaxQueueLength() {
        return 0;
    }

    public double calculateExpNumberJobsPerServer() {
        return 0;
    }

    public double calculateExpNumberJobsRemainingAfter() {
        return 0;
    }

    public double calculatePercentageJobsLeftEarly() {
        return 0;
    }

    public double calculateProbOneServerAvailable() {
        return 0;
    }

    public double calculateProbTwoServersAvailable() {
        return 0;
    }

    public void addToWaitingQueue(Job job) {
        this.waitingQueue.add(job);
    }

    public void dispatchFromQueue() {
        this.waitingQueue.remove();
    }


}
