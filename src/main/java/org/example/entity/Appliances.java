package org.example.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Supportive class, that contains lists of all types of appliances
 */
@XmlRootElement
public class Appliances {

    private List<Oven> ovens = new ArrayList<>();
    private List<Laptop> laptops = new ArrayList<>();
    private List<Refrigerator> refrigerators = new ArrayList<>();
    private List<Speakers> speakers = new ArrayList<>();
    private List<Kettle> kettles = new ArrayList<>();
    private List<VacuumCleaner> vacuumCleaners = new ArrayList<>();

    private static final List<Class> supportedAppliances = new ArrayList<>(Arrays.asList(Oven.class,Laptop.class,Refrigerator.class,
            Speakers.class,Kettle.class,VacuumCleaner.class));
    public Appliances() {
    }

    /**
     * Returns all types of appliances this class supports
     * @return
     */
    public static List<Class> getSupportedAppliances() {
        return supportedAppliances;
    }

    /**
     * Add instance of appliance to its type list
     * @param appliance - that should be added
     * @param <T> - class of appliance
     */
    public<T extends Appliance>void add(T appliance) {
        switch (appliance.getClass().getSimpleName()) {
            case "Oven":
                ovens.add((Oven) appliance);
                break;
            case "Laptop":
                laptops.add((Laptop) appliance);
                break;
            case "Refrigerator":
                refrigerators.add((Refrigerator) appliance);
                break;
            case "Speakers":
                speakers.add((Speakers) appliance);
                break;
            case "Kettle":
                kettles.add((Kettle) appliance);
                break;
            case "VacuumCleaner":
                vacuumCleaners.add((VacuumCleaner) appliance);
                break;
        }
    }

    /**
     * Returns list of appliances of specific type
     * @param simpleName - appliance type name
     * @return Object List - appliance instances of specific type
     */
    public List get(String simpleName) {
        switch (simpleName) {
            case "Oven":
                return ovens;
            case "Laptop":
                return laptops;
            case "Refrigerator":
                return refrigerators;
            case "Speakers":
                return speakers;
            case "Kettle":
                return kettles;
            case "VacuumCleaner":
                return vacuumCleaners;
            default:
                return new ArrayList<>();
        }
    }

    @XmlElement(name = "oven")
    public List<Oven> getOvens() {
        return ovens;
    }
    @XmlElement(name = "laptop")
    public List<Laptop> getLaptops() {
        return laptops;
    }
    @XmlElement(name = "refrigerator")
    public List<Refrigerator> getRefrigerators() {
        return refrigerators;
    }
    @XmlElement(name = "speakers")
    public List<Speakers> getSpeakers() {
        return speakers;
    }
    @XmlElement(name = "kettle")
    public List<Kettle> getKettles() {
        return kettles;
    }
    @XmlElement(name = "vacuumCleaner")
    public List<VacuumCleaner> getVacuumCleaners() {
        return vacuumCleaners;
    }

    public void setOvens(List<Oven> ovens) {
        this.ovens = ovens;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    public void setRefrigerators(List<Refrigerator> refrigerators) {
        this.refrigerators = refrigerators;
    }

    public void setSpeakers(List<Speakers> speakers) {
        this.speakers = speakers;
    }

    public void setKettles(List<Kettle> kettles) {
        this.kettles = kettles;
    }

    public void setVacuumCleaners(List<VacuumCleaner> vacuumCleaners) {
        this.vacuumCleaners = vacuumCleaners;
    }
}
