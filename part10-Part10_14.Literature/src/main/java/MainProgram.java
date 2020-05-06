
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<Book>();
        while (true) {
            //Input the name of the book, empty stops: The Ringing Lullaby Book
            //Input the age recommendation: 0
            System.out.print("Input the name of the book, empty stops: ");
            String inputName = scanner.nextLine();
            if (inputName.isEmpty()) {
                break;
            }

            System.out.print("Input the age recommendation: ");
            int inputAge = Integer.valueOf(scanner.nextLine());
            System.out.println("");
            books.add(new Book(inputName, inputAge));
        }
        System.out.println("" + books.size() + " books in total.");
        Comparator<Book> comperator = Comparator.comparing(Book::getAge)
                .thenComparing(Book::getName);
        Collections.sort(books, comperator);
        //System.out.println("");

        System.out.println("Books:");
        for (Book book : books) {
            System.out.println(book);
        }

    }

}
