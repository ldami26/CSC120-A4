public class Engine {
    private FuelType fuelType;
    private double currentFuelLevel;
    private double maxFuelLevel;

    /**
     * Constructor for the Engine class.
     * @param fuelType The type of fuel the engine uses.
     * @param maxFuelLevel The maximum fuel level.
     */
    public Engine(FuelType fuelType, double maxFuelLevel) {
        this.fuelType = fuelType;
        this.maxFuelLevel = maxFuelLevel;
        this.currentFuelLevel = maxFuelLevel;
    }

    /**
     * Refuels the engine to its maximum fuel level.
     */
    public void refuel() {
        this.currentFuelLevel = maxFuelLevel;
    }

    /**
     * Simulates the engine consuming fuel to run the train.
     * @return True if the engine has fuel left, False otherwise.
     */
    public boolean go() {
        if (currentFuelLevel > 0) {
            currentFuelLevel -= 10; // Consume fuel
            System.out.println("Remaining fuel: " + currentFuelLevel);
            return true;
        }
        return false;
    }

    // Accessor for fuel type
    public FuelType getFuelType() {
        return fuelType;
    }

    // Accessor for current fuel level
    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    // Accessor for maximum fuel level
    public double getMaxFuelLevel() {
        return maxFuelLevel;
    }

    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");
    }
}