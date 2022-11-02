package org.example.entity;

public class Speakers extends Appliance{
	public double powerConsumption;
    public int numberOfSpeakers;
    public double minFrequency;
    public double maxFrequency;
    public double cordLength;

    public Speakers() {
    }

    public Speakers(double powerConsumption, int numberOfSpeakers, double minFrequency, double maxFrequency, double cordLength) {
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.minFrequency = minFrequency;
        this.maxFrequency = maxFrequency;
        this.cordLength = cordLength;
    }

}
