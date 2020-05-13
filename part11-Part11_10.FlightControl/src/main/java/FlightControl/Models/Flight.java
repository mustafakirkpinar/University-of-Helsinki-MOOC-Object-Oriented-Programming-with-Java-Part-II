
package FlightControl.Models;


public class Flight {
    private AirPlane airplane;
    private String departure;
    private String target;

    public Flight(AirPlane airplane, String departure, String target) {
        this.airplane = airplane;
        this.departure = departure;
        this.target = target;
    }

    public AirPlane getAirplane() {
        return airplane;
    }

    public String getDeparture() {
        return departure;
    }

    public String getTarget() {
        return target;
    }

    @Override
    public String toString() {
        return this.airplane.getId()+" (" + this.airplane.getCapacity() + 
                " capacity) ("+this.departure+"-"+this.getTarget()+")";
    }

    @Override
    public boolean equals(Object obj) {
        Flight match = (Flight) obj;
        return this.departure.equals(match.getDeparture()) 
                && this.airplane.equals(match.airplane)
                && this.target.equals(match.getTarget()); 
    }

    @Override
    public int hashCode() {
        return this.airplane.hashCode();
    }
    
    
    

}
