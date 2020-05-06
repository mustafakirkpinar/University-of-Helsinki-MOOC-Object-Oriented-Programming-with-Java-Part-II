
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

    private final List<Person> people = new ArrayList();

    public void add(Person personToAdd) {
        this.people.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        peopleToAdd.stream().forEach(person -> this.people.add(person));
    }

    public void print() {
        Iterator<Person> iterator = this.people.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    public void print(Education education) {
        Iterator<Person> iterator = this.people.iterator();
        while (iterator.hasNext()) {
            Person p = iterator.next();
            if (p.getEducation() == education) {
                System.out.println(p);
            }
        }

    }

    public void fire(Education education) {
        Iterator<Person> iterator = this.people.iterator();
        List<Person> peopleToDelete = new ArrayList();
        while (iterator.hasNext()) {
            Person p = iterator.next();

            if (p.getEducation() == education) {
                peopleToDelete.add(p);

            }

        }
        people.removeAll(peopleToDelete);
    }
}
