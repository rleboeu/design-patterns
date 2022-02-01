package factory;

/**
 * Enables the creation of a car
 * @author rleboeuf
 * @version 1.0.0
 */
public class CarFactory {

    /**
     * Creates and returns a new car
     * @param type of car
     * @param make of car
     * @param model of car
     * @return Car that was created
     */
    public static Car createCar(String type, String make, String model) {
        Car car;

        // create a car dependent on what the specified type is
        if (type.equals("small")) {
            car = new SmallCar(make, model);
        } else if (type.equals("sedan")) {
            car = new SedanCar(make, model);
        } else if (type.equals("luxury")) {
            car = new LuxuryCar(make, model);
        } else {
            car = new SmallCar(make, model);
        }

        return car;
    }
    
}
