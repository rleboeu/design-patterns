package factory;

import java.util.ArrayList;

/**
 * Car class
 * @author rleboeuf
 * @version 1.0.0
 */
public abstract class Car {
    
    // fields
    private String make;
    private String model;
    protected ArrayList<Accessory> accessories;

    /**
     * Constructor
     * @param make of the car
     * @param model of the car
     */
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
        this.accessories = new ArrayList<Accessory>();
    }

    /**
     * Assemble the car
     */
    public void assemble() {
        this.addFrame();
        this.addWheels();
        this.addEngine();
        this.addWindows();
        this.addAccessories();
        this.displayAccessories();
    }

    /**
     * Prints to terminal that the frame is being added
     */
    protected abstract void addFrame();

    /**
     * Adds accessories to the car
     */
    protected abstract void addAccessories();

    /**
     * Prints to terminal that the wheels are being added
     */
    protected void addWheels() {
        System.out.println("Adding the wheels");
    }

    /**
     * Prints to terminal that the engine is being added
     */
    protected void addEngine() {
        System.out.println("Adding a standard engine");
    }

    /**
     * Prints to terminal that the windows are being added
     */
    protected void addWindows() {
        System.out.println("Adding the windows");
    }

    /**
     * Prints all accessories of the Car
     */
    protected void displayAccessories() {
        System.out.println("Accessories:");
        
        // print each accessory of the car
        for (Accessory ax : this.accessories) {
            System.out.println("- " + ax.toString());
        }
    }

}
