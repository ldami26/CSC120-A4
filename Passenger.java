public class Passenger {
    private String name;

    /**
     * Constructor for the Passenger class.
     * @param name The name of the passenger.
     */
    public Passenger(String name) {
        this.name = name;
    }

    /**
     * Boards a given car.
     * @param c The car to board.
     * @return True if the boarding was successful, False otherwise.
     */
    public boolean boardCar(Car c) {
        return c.addPassenger(this);
    }

    /**
     * Gets off a given car.
     * @param c The car to leave.
     * @return True if the passenger was removed, False otherwise.
     */
    public boolean getOffCar(Car c) {
        return c.removePassenger(this);
    }

    /**
     * Gets the name of the passenger.
     * @return The name of the passenger.
     */
    public String getName() {
        return name;
    }
}