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
        if (type.equals(CarType.SMALL.toString().toLowerCase())) {
            car = new SmallCar(make, model);
        } else if (type.equals(CarType.SEDAN.toString().toLowerCase())) {
            car = new SedanCar(make, model);
        } else if (type.equals(CarType.LUXURY.toString().toLowerCase())) {
            car = new LuxuryCar(make, model);
        } else {
            car = new SmallCar(make, model);
        }

        car.assemble();

        return car;
    }
    
}
