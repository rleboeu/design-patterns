package factory;

/**
 * LuxuryCar class
 * @author rleboeuf
 * @version 1.0.0
 */
public class LuxuryCar extends Car {

    /**
     * Constructor
     * @param make of the car
     * @param model of the car
     */
    public LuxuryCar(String make, String model) {
        super(make, model);
    }

    @Override
    protected void addFrame() {
        System.out.println("Adding a beautiful frame");
    }

    @Override
    protected void addAccessories() {
        this.accessories.add(Accessory.FLOOR_MATTS);
        this.accessories.add(Accessory.PHONE_CHARGER);
        this.accessories.add(Accessory.BACK_UP_CAMERA);
        this.accessories.add(Accessory.EXTRA_CUP_HOLDERS);
        this.accessories.add(Accessory.HEATED_SEATS);
        this.accessories.add(Accessory.SPORTS_SEATS);
        this.accessories.add(Accessory.WINDOW_TINT);
        this.accessories.add(Accessory.HIGH_END_SOUND);
        this.accessories.add(Accessory.TRUNK_ORGANIZER);
        this.accessories.add(Accessory.BLUE_TOOTH);
    }

    @Override
    protected void addEngine() {
        System.out.println("Adding a supped up engine");
    }
    
}
