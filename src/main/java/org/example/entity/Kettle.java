package org.example.entity;

public class Kettle extends Appliance{
	public double powerConsumption;
    public double volume;
    public int temperature;
    public boolean hasWifiConnection;
    public String color;

    public Kettle() {
    }

    public Kettle(double powerConsumption, double volume, int temperature, boolean hasWifiConnection, String color) {
        this.powerConsumption = powerConsumption;
        this.volume = volume;
        this.temperature = temperature;
        this.hasWifiConnection = hasWifiConnection;
        this.color = color;
    }
}
