
package application;

public class StandardSensor implements Sensor {

    private int value;
    private final boolean on = true;
    
    public StandardSensor(int value) {
        this.value = value;
    }
    
    
    
    @Override
    public boolean isOn() {
        return this.on;
    }

    @Override
    public void setOn() {
    }

    @Override
    public void setOff() {
    }

    @Override
    public int read() {
return value;
    }
    
}
