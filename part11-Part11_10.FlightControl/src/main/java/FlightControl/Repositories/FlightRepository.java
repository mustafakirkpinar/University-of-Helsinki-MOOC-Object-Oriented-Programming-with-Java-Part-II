package FlightControl.Repositories;

import FlightControl.Models.AirPlane;
import FlightControl.Models.Flight;
import java.util.ArrayList;
import java.util.HashMap;

public class FlightRepository {

    private static FlightRepository instance = null;
    private HashMap<AirPlane, ArrayList<Flight>> flightRepository;

    private FlightRepository() {
        this.flightRepository = new HashMap<AirPlane, ArrayList<Flight>>();
    }

    public static FlightRepository getInstance() {
        if (instance == null) {
            instance = new FlightRepository();
        }
        return instance;
    }

    public void put(AirPlane ap, Flight f) {
        if (getInstance().flightRepository.containsKey(ap)) {
            getInstance().flightRepository.get(ap).add(f);
        } else {
            ArrayList<Flight> alf = new ArrayList();
            alf.add(f);
            getInstance().flightRepository.put(ap, alf);
        }
    }

    public ArrayList<Flight> get(AirPlane ap) {
        return getInstance().flightRepository.get(ap);
    }

    public HashMap<AirPlane, ArrayList <Flight>> getFlightRepository() {
        return flightRepository;
    }

}
