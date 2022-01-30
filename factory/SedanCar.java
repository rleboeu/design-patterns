package factory;

/**
 * SedanCar class
 * @author rleboeuf
 * @version 1.0.0
 */
public class SedanCar extends Car {

    /**
     * Constructor 
     * @param make of the car
     * @param model of the car
     */
    public SedanCar(String make, String model) {
        super(make, model);
    }

    @Override
    protected void addFrame() {
        System.out.println("Adding a three part frame");
    }

    @Override
    protected void addAccessories() {
        this.accessories.add(Accessory.FLOOR_MATTS);
        this.accessories.add(Accessory.PHONE_CHARGER);
        this.accessories.add(Accessory.BACK_UP_CAMERA);
        this.accessories.add(Accessory.EXTRA_CUP_HOLDERS);
        this.accessories.add(Accessory.HEATED_SEATS);
    }
    
}
