
public class Book {
    private String name;
    private int age;

    public Book(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        //The Ringing Lullaby Book (recommended for 0 year-olds or older)
        return name + " (recommended for "+age+" year-olds or older)";
    }
    
    
}
