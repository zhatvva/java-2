package org.example.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Oven extends Appliance {
	public double powerConsumption;

    public double weight;
    public double capacity;
    public double depth;
    public double width;
    public double height;

    public Oven(double powerConsumption, double weight, double capacity, double depth, double width, double height) {
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
        this.width = width;
        this.height = height;
    }

    public Oven() {
    }

}
