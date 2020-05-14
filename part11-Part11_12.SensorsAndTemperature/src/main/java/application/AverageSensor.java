package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private List<Sensor> sensorList = new ArrayList();

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
        if (!this.isOn() || this.sensorList.isEmpty()) {
            throw new IllegalStateException();
        }
        int sum = this.sensorList.stream().map(s -> s.read()).reduce(0, (a, b) -> Integer.sum(a, b)).intValue();
        
        return sum / this.sensorList.size();
    }

    public List<Integer> readings() {
        List<Integer> values = new ArrayList<Integer>();
        for (Sensor s : this.sensorList) {
            if (s instanceof TemperatureSensor) {
                values.add(s.read());
            }
        }
        return values;

    }
}
