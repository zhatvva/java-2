package org.example.entity;

public class VacuumCleaner extends Appliance{
	public double powerConsumprion;
    public char filterType;
    public String bagType;
    public String wandType;
    public int motorSpeedRegulation;
    public int cleaningWidth;

    public VacuumCleaner() {
    }

    public VacuumCleaner(double powerConsumprion, char filterType, String bagType, String wandType, int motorSpeedRegulation, int cleaningWidth) {
        this.powerConsumprion = powerConsumprion;
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }

}
