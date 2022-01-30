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
        Car car = null;

        // create a car dependent on what the specified type is
        if (type.equals("small")) {
            car = new SmallCar(make, model);
        } else if (type.equals("sedan")) {
            car = new SedanCar(make, model);
        } else if (type.equals("luxury")) {
            car = new LuxuryCar(make, model);
        }

        if (car != null) {
            System.out.println("Creating a " + make + " " + model);
            car.assemble();
        } else {
            System.out.println("Type not recognized...");
        }

        return car;
    }
    
}
