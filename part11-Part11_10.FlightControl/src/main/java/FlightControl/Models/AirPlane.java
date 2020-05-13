
package FlightControl.Models;

public class AirPlane {
    private String id;
    private int capacity;

    public AirPlane(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }
    
    public String getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return this.id+" (" + this.capacity + " capacity)";
    }

    @Override
    public boolean equals(Object obj) {
        AirPlane match = (AirPlane) obj;
        return this.id.equals(match.getId())&&this.capacity==match.getCapacity(); 
    }

    @Override
    public int hashCode() {
        return this.id.toUpperCase().hashCode();
    }
    
    
    
}
