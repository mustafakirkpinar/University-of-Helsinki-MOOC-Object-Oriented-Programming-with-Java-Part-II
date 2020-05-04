
public class Dog extends Animal implements NoiseCapable {

    public Dog() {
        super("Dog");
    }

    public Dog(String st) {
        super(st);
    }
    
    public void bark() {
        System.out.println(this.getName() + " barks");
    }

    @Override
    public void makeNoise() {
        this.bark();
    }
}
