class Transport {

    String transportName;
    int capacity;

    Transport(String transportName, int capacity) {
        this.transportName = transportName;
        this.capacity = capacity;
    }

    void displayTransport() {
        System.out.println("Transport: " + transportName);
        System.out.println("Capacity: " + capacity);
    }
}

class Train extends Transport {

    int numberOfCoaches;

    Train(String transportName, int capacity,
          int numberOfCoaches) {

        super(transportName, capacity);
        this.numberOfCoaches = numberOfCoaches;
    }

    void displayTrain() {
        displayTransport();
        System.out.println("Number of Coaches: " + numberOfCoaches);
    }
}

class Flight extends Transport {

    String airlineName;

    Flight(String transportName, int capacity,
           String airlineName) {

        super(transportName, capacity);
        this.airlineName = airlineName;
    }

    void displayFlight() {
        displayTransport();
        System.out.println("Airline: " + airlineName);
    }
}

public class TransportDemo {

    public static void main(String[] args) {

        Train train =
                new Train("Express Train", 1000, 20);

        Flight flight =
                new Flight("Passenger Flight", 300, "IndiGo");

        System.out.println("----- Train -----");
        train.displayTrain();

        System.out.println("\n----- Flight -----");
        flight.displayFlight();
    }
}