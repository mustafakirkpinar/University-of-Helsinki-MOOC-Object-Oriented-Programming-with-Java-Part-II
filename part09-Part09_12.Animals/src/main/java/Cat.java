
public class Cat extends Animal implements NoiseCapable {

    public Cat() {
        super("Cat");
    }
    
    public Cat(String st) {
        super(st);
    }

    public void purr() {
        System.out.println(this.getName() + " purrs");
    }

    @Override
    public void makeNoise() {
        this.purr();
    }

}
