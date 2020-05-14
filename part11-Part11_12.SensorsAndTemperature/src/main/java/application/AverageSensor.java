package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private List<Sensor> sensorList = new ArrayList();
     private List<Integer> readings=new ArrayList<>(); 
   

    public void addSensor(Sensor toAdd) {
        this.sensorList.add(toAdd);
    }

    @Override
    public boolean isOn() {
        return this.sensorList.stream().map(Sensor::isOn).allMatch(s -> s == true);
    }

    @Override
    public void setOn() {
        this.sensorList.stream().forEach(Sensor::setOn);
    }

    @Override
    public void setOff() {
        this.sensorList.stream().forEach(Sensor::setOff);
    }

     @Override
    public int read() {
        if (this.sensorList.size() == 0 || !this.isOn()) {
            throw new IllegalStateException();
        }

        int reading = (int) this.sensorList.stream()
                .mapToInt(sensor -> sensor.read())
                .average()
                .getAsDouble();
        
        this.readings.add(reading);
        return reading;
    }

    public List<Integer> readings() {
        return this.readings;
    }
}
