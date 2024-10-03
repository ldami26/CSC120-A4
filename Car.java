import java.util.ArrayList;

public class Car {
    private ArrayList<Passenger> passengers;
    private int maxCapacity;

    /**
     * Constructor for the Car class.
     * @param maxCapacity The maximum number of passengers the car can hold.
     */
    public Car(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.passengers = new ArrayList<>();
    }

    /**
     * Adds a passenger to the car if there's room.
     * @param p The passenger to add.
     * @return True if the passenger was added, False otherwise.
     */
    public boolean addPassenger(Passenger p) {
        if (passengers.size() < maxCapacity) {
            passengers.add(p);
            return true;
        }
        return false; // Car is full
    }

    /**
     * Removes a passenger from the car.
     * @param p The passenger to remove.
     * @return True if the passenger was removed, False otherwise.
     */
    public boolean removePassenger(Passenger p) {
        return passengers.remove(p);
    }

    /**
     * Prints the manifest of passengers on this car.
     */
    public void printManifest() {
        if (passengers.isEmpty()) {
            System.out.println("This car is EMPTY.");
        } else {
            for (Passenger p : passengers) {
                System.out.println(p.getName());
            }
        }
    }

    // Accessor for the car's maximum capacity
    public int getCapacity() {
        return maxCapacity;
    }

    // Accessor for the number of remaining seats
    public int seatsRemaining() {
        return maxCapacity - passengers.size();
    }
}