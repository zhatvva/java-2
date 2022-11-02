package org.example.entity;

public class Laptop extends Appliance{
	public double batteryCapacity;
    public String OS;
    public int memoryROM;
    public int systemMemory;
    public double CPU;
    public int displayInchs;

    public Laptop() {
    }

    public Laptop(double batteryCapacity, String OS, int memoryROM, int systemMemory, double CPU, int displayInchs) {
        this.batteryCapacity = batteryCapacity;
        this.OS = OS;
        this.memoryROM = memoryROM;
        this.systemMemory = systemMemory;
        this.CPU = CPU;
        this.displayInchs = displayInchs;
    }


}
