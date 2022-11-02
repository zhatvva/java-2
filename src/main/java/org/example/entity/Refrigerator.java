package org.example.entity;

public class Refrigerator extends Appliance{
	public double powerConsumption;
    public double weight;
    public double freezerCapacity;
    public double overallCapacity;
    public double height;
    public double width;

    public Refrigerator() {
    }

    public Refrigerator(double powerConsumption, double weight, double freezerCapacity, double overallCapacity, double height, double width) {
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
        this.height = height;
        this.width = width;
    }

}
