package factory;

/**
 * SmallCar class
 * @author rleboeuf
 * @version 1.0.0
 */
public class SmallCar extends Car {

    /**
     * Constructor
     * @param make of the car
     * @param model of the car
     */ 
    public SmallCar(String make, String model) {
        super(make, model);
    }

    @Override
    protected void addFrame() {
        System.out.println("Adding a small frame");
    }

    @Override
    protected void addAccessories() {
        this.accessories.add(Accessory.FLOOR_MATTS);
        this.accessories.add(Accessory.PHONE_CHARGER);
    }
    
}
