import java.util.ArrayList;

public class Train {
    private Engine engine;
    private ArrayList<Car> cars;

    /**
     * Constructor for the Train class.
     * @param fuelType The type of fuel the engine uses.
     * @param fuelCapacity The maximum fuel capacity of the engine.
     * @param nCars The number of cars the train has.
     * @param passengerCapacity The maximum number of passengers each car can hold.
     */
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity) {
        this.engine = new Engine(fuelType, fuelCapacity);
        this.cars = new ArrayList<>();
        for (int i = 0; i < nCars; i++) {
            cars.add(new Car(passengerCapacity));
        }
    }

    /**
     * Gets the engine of the train.
     * @return The engine.
     */
    public Engine getEngine() {
        return engine;
    }

    /**
     * Gets a specific car in the train.
     * @param i The index of the car to retrieve.
     * @return The car at the specified index.
     */
    public Car getCar(int i) {
        if (i >= 0 && i < cars.size()) {
            return cars.get(i);
        }
        return null; // Index out of bounds
    }

    /**
     * Gets the total maximum capacity of the train.
     * @return The total maximum capacity.
     */
    public int getMaxCapacity() {
        int totalCapacity = 0;
        for (Car car : cars) {
            totalCapacity += car.getCapacity();
        }
        return totalCapacity;
    }

    /**
     * Gets the total number of seats remaining on the train.
     * @return The number of seats remaining.
     */
    public int seatsRemaining() {
        int seatsRemaining = 0;
        for (Car car : cars) {
            seatsRemaining += car.seatsRemaining();
        }
        return seatsRemaining;
    }

    /**
     * Prints the manifest of all passengers on the train.
     */
    public void printManifest() {
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("Car " + (i + 1) + ":");
            cars.get(i).printManifest();
        }
    }

    public static void main(String[] args) {
        Train train = new Train(FuelType.STEAM, 100.0, 3, 5);
        Passenger p1 = new Passenger("John");
        Passenger p2 = new Passenger("Alice");

        p1.boardCar(train.getCar(0));
        p2.boardCar(train.getCar(1));

        train.printManifest();
        System.out.println("Seats remaining: " + train.seatsRemaining());
    }
}