package FlightControl.Repositories;

import FlightControl.Models.AirPlane;
import java.util.HashMap;

public class AirPlaneRepository {

    private static AirPlaneRepository instance = null;
    private HashMap<String, AirPlane> airPlaneRepository;

    private AirPlaneRepository() {
        this.airPlaneRepository = new HashMap<String, AirPlane>();
    }

    public static AirPlaneRepository getInstance() {
        if (instance == null) {
            instance = new AirPlaneRepository();
        }
        return instance;
    }

    public void put(String str, AirPlane ap) {
        getInstance().airPlaneRepository.putIfAbsent(str, ap);
    }

    public HashMap<String, AirPlane> getAirPlaneRepository() {
        return airPlaneRepository;
    }
    
    public AirPlane get(String str) {
        return getInstance().airPlaneRepository.get(str);
    }
    
    
}
