package factory;

/**
 * CarStore program
 */
public class CarStore {
    
    /**
     * Constructor
     */
    public CarStore(){
        System.out.println("Welcome to our car store\n");    
    }

    /**
     * Run the program
     */
    public void run() {
        Car car1 = CarFactory.createCar("small", "Ford", "Fiesta");
        System.out.println();
        
        Car car2 = CarFactory.createCar("sedan", "Nissan", "Altima");
        System.out.println();
        
        Car car3 = CarFactory.createCar("luxury", "Mercedes", "GT");
    }

    public static void main(String[] args){
        CarStore store = new CarStore();
        store.run();
    }
}
