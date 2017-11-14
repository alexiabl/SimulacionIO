package sample;

import sample.Distribution.Distribution;

import java.lang.System;
import java.time.Duration;
import java.util.*;
import java.lang.*;
import java.util.concurrent.Callable;

/**
 * Created by alexiaborchgrevink on 11/13/17.
 */
public class Job implements Callable {

    private Distribution server;
    private double serviceProbability;
    private double serviceTime;

    public Job() {
    }

    public Distribution getserver() {
        return server;
    }

    public void setserver(Distribution server) {
        this.server = server;
    }

    public double getServiceProbability() {
        return serviceProbability;
    }

    public void setServiceProbability(double serviceProbability) {
        this.serviceProbability = serviceProbability;
    }

    public void setServiceTime(double serviceTime) {
        this.serviceTime = serviceTime;
    }

    public Job(Distribution d, double serviceProbability) {
        this.server = d;
        this.serviceProbability = serviceProbability;
    }


    public double getServiceTime() {
        return this.serviceTime;
    }

    @Override
    public Object call() throws Exception {
        System.out.println("The job is running. " + "The server is " + server.getClass().getSimpleName());
        this.serviceTime = server.calculateServiceTime(this.serviceProbability);
        return this.serviceTime;
    }
}
